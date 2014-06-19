$(function () {
    "use strict";

    var socket = $.atmosphere;
    var request = { url: 'http://localhost:8080/chat',
                         contentType : "application/json",
                         logLevel : 'debug',
                         transport : 'websocket' ,
                         fallbackTransport: 'long-polling'};

    request.onOpen = function(response) {
        console.log('Response transport: ' + response.transport);
        $("input").removeAttr('disabled').focus();
        $("status").text('Choose name:');
    };

    request.onMessage = function (response) {
        var message = response.responseBody;
        try {
            var json = JSON.parse(message);
         } catch (e) {
            console.log('This does not look like a valid JSON: ', message.data);
            return;
         }

        if (!logged) {
            logged = true;
            $("status").text(myName + ': ').css('color', 'blue');
            $("input").removeAttr('disabled').focus();
        } else {
            $("input").removeAttr('disabled');
            var me = json.author == author;
            var date =  typeof(json.time) == 'string' ? parseInt(json.time) : json.time;
            addMessage(json.author, json.text, me ? 'blue' : 'black', new Date());
        }
    };

    request.onError = function(response) {
        console.log('Sorry, but there is some problem with your socket or the server is down');
    };

    var subSocket = socket.subscribe(request);

    $("input").keydown(function(e) {
        if (e.keyCode === 13) {
            var msg = $(this).val();

            if (author == null) {
                author = msg;
            }
            subSocket.push(JSON.stringify({ author: author, message: msg }));
            $(this).val('');

            $("input").attr('disabled', 'disabled');
            if (myName === false) {
                myName = msg;
             }
        }
     });

    function addMessage(author, message, color, datetime) {
        content.append('<p><span style="color:' + color + '">' + author + '</span> @ ' +
            + (datetime.getHours() < 10 ? '0' + datetime.getHours() : datetime.getHours()) + ':'
            + (datetime.getMinutes() < 10 ? '0' + datetime.getMinutes() : datetime.getMinutes())
            + ': ' + message + '</p>');
        77     }
});
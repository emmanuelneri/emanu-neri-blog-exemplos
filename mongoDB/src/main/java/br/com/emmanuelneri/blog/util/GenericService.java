package br.com.emmanuelneri.blog.util;

import com.mongodb.MongoClient;
import com.mongodb.DB;

import java.net.UnknownHostException;

public abstract class GenericService {

    public static final String endereco = "localhost";
    public static final int porta = 27017;
    public static final String dbNome = "test";

    private MongoClient client;
    private DB db;

    protected void inicializarMongo() throws UnknownHostException {
        this.client = new MongoClient(endereco, porta);
        this.db = this.client.getDB(dbNome);
    }

    protected void finalizaMongo() {
        this.client.close();
    }

    protected DB getDb() {
        return db;
    }

    protected MongoClient getClient() {
        return client;
    }
}

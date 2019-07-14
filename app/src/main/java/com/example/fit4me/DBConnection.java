package com.example.fit4me;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class DBConnection {
    private FirebaseFirestore db ;

    public DBConnection() {
        db = FirebaseFirestore.getInstance();
    }

    public CollectionReference getCollectionReference(String collectionName) {
        return db.collection(collectionName);
    }
}

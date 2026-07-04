package com.daaw;

import com.google.firebase.firestore.FirebaseFirestore;

/* JADX INFO: renamed from: com.daaw.Gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0976Gm extends com.google.firebase.firestore.f {
    public C0976Gm(UI0 ui0, FirebaseFirestore firebaseFirestore) {
        super(C5890kC0.b(ui0), firebaseFirestore);
        if (ui0.p() % 2 == 1) {
            return;
        }
        throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + ui0.g() + " has " + ui0.p());
    }

    public com.google.firebase.firestore.a x(String str) {
        AbstractC8342sy0.c(str, "Provided document path must not be null.");
        return com.google.firebase.firestore.a.a((UI0) this.a.m().a(UI0.u(str)), this.b);
    }
}

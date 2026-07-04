package com.daaw;

import com.google.firebase.firestore.FirebaseFirestore;

/* JADX INFO: renamed from: com.daaw.lC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6178lC0 extends AbstractC3651cD {
    public C6178lC0(FirebaseFirestore firebaseFirestore, TC tc, LC lc, boolean z, boolean z2) {
        super(firebaseFirestore, tc, lc, z, z2);
    }

    public static C6178lC0 e(FirebaseFirestore firebaseFirestore, LC lc, boolean z, boolean z2) {
        return new C6178lC0(firebaseFirestore, lc.getKey(), lc, z, z2);
    }
}

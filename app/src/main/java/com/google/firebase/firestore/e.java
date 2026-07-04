package com.google.firebase.firestore;

import android.content.Context;
import com.daaw.C7050oL;
import com.daaw.InterfaceC7086oU;
import com.daaw.InterfaceC7784qy;
import com.daaw.InterfaceC9288wL;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class e implements InterfaceC9288wL, FirebaseFirestore.a {
    public final Map a = new HashMap();
    public final C7050oL b;
    public final Context c;
    public final InterfaceC7784qy d;
    public final InterfaceC7784qy e;
    public final InterfaceC7086oU f;

    public e(Context context, C7050oL c7050oL, InterfaceC7784qy interfaceC7784qy, InterfaceC7784qy interfaceC7784qy2, InterfaceC7086oU interfaceC7086oU) {
        this.c = context;
        this.b = c7050oL;
        this.d = interfaceC7784qy;
        this.e = interfaceC7784qy2;
        this.f = interfaceC7086oU;
        c7050oL.h(this);
    }

    public synchronized FirebaseFirestore a(String str) throws Throwable {
        try {
            try {
                FirebaseFirestore firebaseFirestoreH = (FirebaseFirestore) this.a.get(str);
                if (firebaseFirestoreH == null) {
                    firebaseFirestoreH = FirebaseFirestore.h(this.c, this.b, this.d, this.e, str, this, this.f);
                    this.a.put(str, firebaseFirestoreH);
                }
                return firebaseFirestoreH;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}

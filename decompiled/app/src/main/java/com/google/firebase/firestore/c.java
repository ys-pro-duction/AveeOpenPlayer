package com.google.firebase.firestore;

import android.util.SparseArray;
import com.daaw.AbstractC6557mb;
import com.daaw.AbstractC8342sy0;
import com.daaw.JL;

/* JADX INFO: loaded from: classes3.dex */
public class c extends JL {
    public final a B;

    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        public static final SparseArray T = a();
        public final int B;

        a(int i) {
            this.B = i;
        }

        public static SparseArray a() {
            SparseArray sparseArray = new SparseArray();
            for (a aVar : values()) {
                a aVar2 = (a) sparseArray.get(aVar.g());
                if (aVar2 != null) {
                    throw new IllegalStateException("Code value duplication between " + aVar2 + "&" + aVar.name());
                }
                sparseArray.put(aVar.g(), aVar);
            }
            return sparseArray;
        }

        public static a c(int i) {
            return (a) T.get(i, UNKNOWN);
        }

        public int g() {
            return this.B;
        }
    }

    public c(String str, a aVar) {
        super(str);
        AbstractC8342sy0.c(str, "Provided message must not be null.");
        AbstractC6557mb.d(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.B = (a) AbstractC8342sy0.c(aVar, "Provided code must not be null.");
    }

    public c(String str, a aVar, Throwable th) {
        super(str, th);
        AbstractC8342sy0.c(str, "Provided message must not be null.");
        AbstractC6557mb.d(aVar != a.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.B = (a) AbstractC8342sy0.c(aVar, "Provided code must not be null.");
    }
}

package com.daaw;

import android.os.Looper;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* JADX INFO: loaded from: classes.dex */
public abstract class N2 {
    public static final O90 a = AbstractC3192ab0.a(a.B);

    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5203hl0 invoke() {
            return Looper.getMainLooper() != null ? C2495Uw.B : C3975dO0.B;
        }
    }

    public static final InterfaceC6808nU0 a(Object obj, InterfaceC7645qU0 interfaceC7645qU0) {
        G10.g(interfaceC7645qU0, "policy");
        return new ParcelableSnapshotMutableState(obj, interfaceC7645qU0);
    }
}

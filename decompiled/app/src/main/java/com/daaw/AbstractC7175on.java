package com.daaw;

import com.daaw.AbstractC4654fn;

/* JADX INFO: renamed from: com.daaw.on, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7175on {

    /* JADX INFO: renamed from: com.daaw.on$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AbstractC4654fn.b.values().length];
            a = iArr;
            try {
                iArr[AbstractC4654fn.b.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AbstractC4654fn.b.FLOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static InterfaceC6896nn a(AbstractC4654fn.b bVar) {
        int i = a.a[bVar.ordinal()];
        if (i == 1) {
            return new ES0();
        }
        if (i == 2) {
            return new CN();
        }
        throw new IllegalArgumentException("wrong WHEEL_TYPE");
    }
}

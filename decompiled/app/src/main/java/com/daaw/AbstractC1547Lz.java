package com.daaw;

import com.daaw.C1651Mz;

/* JADX INFO: renamed from: com.daaw.Lz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1547Lz {

    /* JADX INFO: renamed from: com.daaw.Lz$a */
    public static final class a extends AbstractC1547Lz {
        public static final a a = new a();
        public static final int b;

        static {
            C1651Mz.a aVar = C1651Mz.c;
            b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        @Override // com.daaw.AbstractC1547Lz
        public int a() {
            return b;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lz$b */
    public static final class b extends AbstractC1547Lz {
        public static final b a = new b();

        @Override // com.daaw.AbstractC1547Lz
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}

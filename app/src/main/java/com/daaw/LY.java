package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface LY extends List, JY, InterfaceC9783y60 {

    public static final class a extends J implements LY {
        public final LY C;
        public final int D;
        public final int E;
        public int F;

        public a(LY ly, int i, int i2) {
            G10.g(ly, "source");
            this.C = ly;
            this.D = i;
            this.E = i2;
            C6284lc0.c(i, i2, ly.size());
            this.F = i2 - i;
        }

        @Override // com.daaw.AbstractC9193w
        public int e() {
            return this.F;
        }

        @Override // com.daaw.J, java.util.List
        public Object get(int i) {
            C6284lc0.a(i, this.F);
            return this.C.get(this.D + i);
        }

        @Override // com.daaw.J, java.util.List
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public LY subList(int i, int i2) {
            C6284lc0.c(i, i2, this.F);
            LY ly = this.C;
            int i3 = this.D;
            return new a(ly, i + i3, i3 + i2);
        }
    }
}

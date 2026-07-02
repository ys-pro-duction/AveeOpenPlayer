package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public interface IV {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        public final int B;

        a(int i) {
            this.B = i;
        }

        public int a() {
            return this.B;
        }
    }

    a b(String str);
}

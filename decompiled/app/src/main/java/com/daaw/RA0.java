package com.daaw;

import com.daaw.AbstractC3595c10;

/* JADX INFO: loaded from: classes4.dex */
public enum RA0 implements AbstractC3595c10.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);

    public static AbstractC3595c10.b I = new AbstractC3595c10.b() { // from class: com.daaw.RA0.a
        @Override // com.daaw.AbstractC3595c10.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RA0 a(int i) {
            return RA0.a(i);
        }
    };
    public final int B;

    RA0(int i, int i2) {
        this.B = i2;
    }

    public static RA0 a(int i) {
        if (i == 0) {
            return INTERNAL;
        }
        if (i == 1) {
            return PRIVATE;
        }
        if (i == 2) {
            return PROTECTED;
        }
        if (i == 3) {
            return PUBLIC;
        }
        if (i == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i != 5) {
            return null;
        }
        return LOCAL;
    }

    @Override // com.daaw.AbstractC3595c10.a
    public final int b() {
        return this.B;
    }
}

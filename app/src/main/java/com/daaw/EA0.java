package com.daaw;

import com.daaw.AbstractC3595c10;

/* JADX INFO: loaded from: classes4.dex */
public enum EA0 implements AbstractC3595c10.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);

    public static AbstractC3595c10.b G = new AbstractC3595c10.b() { // from class: com.daaw.EA0.a
        @Override // com.daaw.AbstractC3595c10.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EA0 a(int i) {
            return EA0.a(i);
        }
    };
    public final int B;

    EA0(int i, int i2) {
        this.B = i2;
    }

    public static EA0 a(int i) {
        if (i == 0) {
            return FINAL;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return ABSTRACT;
        }
        if (i != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // com.daaw.AbstractC3595c10.a
    public final int b() {
        return this.B;
    }
}

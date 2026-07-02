package com.daaw;

import com.daaw.AbstractC3595c10;

/* JADX INFO: loaded from: classes4.dex */
public enum DA0 implements AbstractC3595c10.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);

    public static AbstractC3595c10.b G = new AbstractC3595c10.b() { // from class: com.daaw.DA0.a
        @Override // com.daaw.AbstractC3595c10.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DA0 a(int i) {
            return DA0.a(i);
        }
    };
    public final int B;

    DA0(int i, int i2) {
        this.B = i2;
    }

    public static DA0 a(int i) {
        if (i == 0) {
            return DECLARATION;
        }
        if (i == 1) {
            return FAKE_OVERRIDE;
        }
        if (i == 2) {
            return DELEGATION;
        }
        if (i != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // com.daaw.AbstractC3595c10.a
    public final int b() {
        return this.B;
    }
}

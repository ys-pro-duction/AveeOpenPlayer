package com.daaw;

import com.daaw.AbstractC3317b10;

/* JADX INFO: renamed from: com.daaw.Uo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2464Uo0 implements AbstractC3317b10.a {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final AbstractC3317b10.b E = new AbstractC3317b10.b() { // from class: com.daaw.Uo0.a
    };
    public final int B;

    EnumC2464Uo0(int i) {
        this.B = i;
    }

    @Override // com.daaw.AbstractC3317b10.a
    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.B;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

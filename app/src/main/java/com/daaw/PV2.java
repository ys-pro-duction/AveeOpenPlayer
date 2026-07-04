package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class PV2 extends AbstractC4279eU2 {
    public final UV2 a;
    public final Z23 b;
    public final Y23 c;
    public final Integer d;

    public PV2(UV2 uv2, Z23 z23, Y23 y23, Integer num) {
        this.a = uv2;
        this.b = z23;
        this.c = y23;
        this.d = num;
    }

    public static PV2 a(TV2 tv2, Z23 z23, Integer num) throws GeneralSecurityException {
        Y23 y23B;
        TV2 tv22 = TV2.d;
        if (tv2 != tv22 && num == null) {
            throw new GeneralSecurityException("For given Variant " + tv2.toString() + " the value of idRequirement must be non-null");
        }
        if (tv2 == tv22 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (z23.a() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + z23.a());
        }
        UV2 uv2B = UV2.b(tv2);
        if (uv2B.a() == tv22) {
            y23B = Y23.b(new byte[0]);
        } else if (uv2B.a() == TV2.c) {
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (uv2B.a() != TV2.b) {
                throw new IllegalStateException("Unknown Variant: ".concat(uv2B.a().toString()));
            }
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new PV2(uv2B, z23, y23B, num);
    }
}

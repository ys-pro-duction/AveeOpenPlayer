package com.daaw;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.sW2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8212sW2 extends AbstractC4279eU2 {
    public final C9614xW2 a;
    public final Z23 b;
    public final Y23 c;
    public final Integer d;

    public C8212sW2(C9614xW2 c9614xW2, Z23 z23, Y23 y23, Integer num) {
        this.a = c9614xW2;
        this.b = z23;
        this.c = y23;
        this.d = num;
    }

    public static C8212sW2 a(C9335wW2 c9335wW2, Z23 z23, Integer num) throws GeneralSecurityException {
        Y23 y23B;
        C9335wW2 c9335wW22 = C9335wW2.d;
        if (c9335wW2 != c9335wW22 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c9335wW2.toString() + " the value of idRequirement must be non-null");
        }
        if (c9335wW2 == c9335wW22 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (z23.a() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + z23.a());
        }
        C9614xW2 c9614xW2B = C9614xW2.b(c9335wW2);
        if (c9614xW2B.a() == c9335wW22) {
            y23B = Y23.b(new byte[0]);
        } else if (c9614xW2B.a() == C9335wW2.c) {
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (c9614xW2B.a() != C9335wW2.b) {
                throw new IllegalStateException("Unknown Variant: ".concat(c9614xW2B.a().toString()));
            }
            y23B = Y23.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new C8212sW2(c9614xW2B, z23, y23B, num);
    }
}

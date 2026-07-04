package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class XX2 implements InterfaceC3738cY2 {
    public final String a;
    public final Y23 b;
    public final AbstractC9213w33 c;
    public final EnumC6686n13 d;
    public final EnumC3603c23 e;
    public final Integer f;

    public XX2(String str, AbstractC9213w33 abstractC9213w33, EnumC6686n13 enumC6686n13, EnumC3603c23 enumC3603c23, Integer num) {
        this.a = str;
        this.b = AbstractC6547mY2.a(str);
        this.c = abstractC9213w33;
        this.d = enumC6686n13;
        this.e = enumC3603c23;
        this.f = num;
    }

    public static XX2 a(String str, AbstractC9213w33 abstractC9213w33, EnumC6686n13 enumC6686n13, EnumC3603c23 enumC3603c23, Integer num) throws GeneralSecurityException {
        if (enumC3603c23 == EnumC3603c23.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new XX2(str, abstractC9213w33, enumC6686n13, enumC3603c23, num);
    }

    public final EnumC6686n13 b() {
        return this.d;
    }

    public final EnumC3603c23 c() {
        return this.e;
    }

    public final AbstractC9213w33 d() {
        return this.c;
    }

    public final Integer e() {
        return this.f;
    }

    public final String f() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC3738cY2
    public final Y23 zzd() {
        return this.b;
    }
}

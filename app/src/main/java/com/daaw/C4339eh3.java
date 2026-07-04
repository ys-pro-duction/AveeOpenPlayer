package com.daaw;

/* JADX INFO: renamed from: com.daaw.eh3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4339eh3 implements Eg3 {
    public final Kg3 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public C4339eh3(Kg3 kg3, String str, Object[] objArr) {
        this.a = kg3;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    public final String a() {
        return this.b;
    }

    public final Object[] b() {
        return this.c;
    }

    @Override // com.daaw.Eg3
    public final Kg3 zza() {
        return this.a;
    }

    @Override // com.daaw.Eg3
    public final boolean zzb() {
        return (this.d & 2) == 2;
    }

    @Override // com.daaw.Eg3
    public final int zzc() {
        return (this.d & 1) == 1 ? 1 : 2;
    }
}

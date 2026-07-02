package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Fp3 implements InterfaceC4678fr3 {
    public final InterfaceC4678fr3[] B;

    public Fp3(InterfaceC4678fr3[] interfaceC4678fr3Arr) {
        this.B = interfaceC4678fr3Arr;
    }

    @Override // com.daaw.InterfaceC4678fr3
    public final void a(long j) {
        for (InterfaceC4678fr3 interfaceC4678fr3 : this.B) {
            interfaceC4678fr3.a(j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // com.daaw.InterfaceC4678fr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(com.daaw.C9651xe3 r19) {
        /*
            r18 = this;
            r0 = r19
            r2 = 0
        L3:
            long r3 = r18.zzc()
            r5 = -9223372036854775808
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L46
            r7 = r18
            com.daaw.fr3[] r8 = r7.B
            int r9 = r8.length
            r10 = 0
            r11 = 0
        L14:
            if (r10 >= r9) goto L3f
            r12 = r8[r10]
            long r13 = r12.zzc()
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r15 == 0) goto L2c
            r16 = r2
            long r1 = r0.a
            int r17 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r17 > 0) goto L2a
            r1 = 1
            goto L2f
        L2a:
            r1 = 0
            goto L2f
        L2c:
            r16 = r2
            goto L2a
        L2f:
            int r2 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r2 == 0) goto L35
            if (r1 == 0) goto L3a
        L35:
            boolean r1 = r12.d(r0)
            r11 = r11 | r1
        L3a:
            int r10 = r10 + 1
            r2 = r16
            goto L14
        L3f:
            r16 = r2
            r2 = r16 | r11
            if (r11 != 0) goto L3
            return r2
        L46:
            r7 = r18
            r16 = r2
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Fp3.d(com.daaw.xe3):boolean");
    }

    @Override // com.daaw.InterfaceC4678fr3
    public final long zzb() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC4678fr3 interfaceC4678fr3 : this.B) {
            long jZzb = interfaceC4678fr3.zzb();
            if (jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.daaw.InterfaceC4678fr3
    public final long zzc() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC4678fr3 interfaceC4678fr3 : this.B) {
            long jZzc = interfaceC4678fr3.zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.daaw.InterfaceC4678fr3
    public final boolean zzp() {
        for (InterfaceC4678fr3 interfaceC4678fr3 : this.B) {
            if (interfaceC4678fr3.zzp()) {
                return true;
            }
        }
        return false;
    }
}

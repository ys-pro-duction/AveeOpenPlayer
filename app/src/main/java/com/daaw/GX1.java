package com.daaw;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class GX1 {
    public static final GX1 d = new GX1(true);
    public final AbstractC5341iE2 a = new C3862cy2(16);
    public boolean b;
    public boolean c;

    public GX1() {
    }

    public static int a(EnumC8463tP2 enumC8463tP2, int i, Object obj) {
        AbstractC5392iR1.w(i << 3);
        if (EnumC8463tP2.L == null) {
            Charset charset = J82.a;
        }
        XP2 xp2 = XP2.INT;
        throw null;
    }

    public static int b(InterfaceC3176aX1 interfaceC3176aX1, Object obj) {
        EnumC8463tP2 enumC8463tP2Zzd = interfaceC3176aX1.zzd();
        int iZza = interfaceC3176aX1.zza();
        if (!interfaceC3176aX1.zzg()) {
            return a(enumC8463tP2Zzd, iZza, obj);
        }
        List list = (List) obj;
        int iA = 0;
        if (!interfaceC3176aX1.zzf()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iA += a(enumC8463tP2Zzd, iZza, it.next());
            }
            return iA;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            return AbstractC5392iR1.w(iZza << 3) + AbstractC5392iR1.w(0);
        }
        it2.next();
        EnumC8463tP2 enumC8463tP2 = EnumC8463tP2.C;
        XP2 xp2 = XP2.INT;
        throw null;
    }

    public static boolean j(Map.Entry entry) {
        AbstractC6314li0.a(entry.getKey());
        throw null;
    }

    public static final int k(Map.Entry entry) {
        AbstractC6314li0.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(com.daaw.InterfaceC3176aX1 r4, java.lang.Object r5) {
        /*
            com.daaw.tP2 r0 = r4.zzd()
            java.nio.charset.Charset r1 = com.daaw.J82.a
            r5.getClass()
            com.daaw.tP2 r1 = com.daaw.EnumC8463tP2.C
            com.daaw.XP2 r1 = com.daaw.XP2.INT
            com.daaw.XP2 r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L19;
                default: goto L18;
            }
        L18:
            goto L44
        L19:
            boolean r0 = r5 instanceof com.daaw.InterfaceC7467pp2
            if (r0 == 0) goto L44
            return
        L1e:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L26
            boolean r0 = r5 instanceof com.daaw.O42
            if (r0 == 0) goto L44
        L26:
            return
        L27:
            boolean r0 = r5 instanceof com.daaw.BM1
            if (r0 != 0) goto L2f
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L44
        L2f:
            return
        L30:
            boolean r0 = r5 instanceof java.lang.String
            goto L41
        L33:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L41
        L36:
            boolean r0 = r5 instanceof java.lang.Double
            goto L41
        L39:
            boolean r0 = r5 instanceof java.lang.Float
            goto L41
        L3c:
            boolean r0 = r5 instanceof java.lang.Long
            goto L41
        L3f:
            boolean r0 = r5 instanceof java.lang.Integer
        L41:
            if (r0 == 0) goto L44
            return
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.daaw.tP2 r4 = r4.zzd()
            com.daaw.XP2 r4 = r4.a()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.GX1.l(com.daaw.aX1, java.lang.Object):void");
    }

    public final int c() {
        int iK = 0;
        for (int i = 0; i < this.a.c(); i++) {
            iK += k(this.a.h(i));
        }
        Iterator it = this.a.d().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        GX1 gx1 = new GX1();
        for (int i = 0; i < this.a.c(); i++) {
            Map.Entry entryH = this.a.h(i);
            AbstractC6314li0.a(entryH.getKey());
            gx1.g(null, entryH.getValue());
        }
        for (Map.Entry entry : this.a.d()) {
            AbstractC6314li0.a(entry.getKey());
            gx1.g(null, entry.getValue());
        }
        gx1.c = this.c;
        return gx1;
    }

    public final Iterator d() {
        return this.c ? new C7681qc2(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public final void e() {
        if (this.b) {
            return;
        }
        for (int i = 0; i < this.a.c(); i++) {
            Map.Entry entryH = this.a.h(i);
            if (entryH.getValue() instanceof F32) {
                ((F32) entryH.getValue()).o();
            }
        }
        this.a.b();
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GX1) {
            return this.a.equals(((GX1) obj).a);
        }
        return false;
    }

    public final void f(GX1 gx1) {
        for (int i = 0; i < gx1.a.c(); i++) {
            i(gx1.a.h(i));
        }
        Iterator it = gx1.a.d().iterator();
        while (it.hasNext()) {
            i((Map.Entry) it.next());
        }
    }

    public final void g(InterfaceC3176aX1 interfaceC3176aX1, Object obj) {
        if (!interfaceC3176aX1.zzg()) {
            l(interfaceC3176aX1, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                l(interfaceC3176aX1, arrayList.get(i));
            }
            obj = arrayList;
        }
        this.a.put(interfaceC3176aX1, obj);
    }

    public final boolean h() {
        for (int i = 0; i < this.a.c(); i++) {
            if (!j(this.a.h(i))) {
                return false;
            }
        }
        Iterator it = this.a.d().iterator();
        while (it.hasNext()) {
            if (!j((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(Map.Entry entry) {
        AbstractC6314li0.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public GX1(boolean z) {
        e();
        e();
    }
}

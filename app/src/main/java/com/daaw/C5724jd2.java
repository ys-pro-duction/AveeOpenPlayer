package com.daaw;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.jd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5724jd2 implements InterfaceC6700n42 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final InterfaceC8394t83 d;
    public final C0522Ce2 e;

    public C5724jd2(Map map, Map map2, Map map3, InterfaceC8394t83 interfaceC8394t83, C0522Ce2 c0522Ce2) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = interfaceC8394t83;
        this.e = c0522Ce2;
    }

    @Override // com.daaw.InterfaceC6700n42
    public final InterfaceC2682Wq2 a(int i, String str) {
        InterfaceC2682Wq2 interfaceC2682Wq2A;
        InterfaceC2682Wq2 interfaceC2682Wq2 = (InterfaceC2682Wq2) this.a.get(str);
        if (interfaceC2682Wq2 != null) {
            return interfaceC2682Wq2;
        }
        if (i == 1) {
            if (this.e.e() == null || (interfaceC2682Wq2A = ((InterfaceC6700n42) this.d.zzb()).a(i, str)) == null) {
                return null;
            }
            return C7815r42.a(interfaceC2682Wq2A);
        }
        if (i != 4) {
            return null;
        }
        InterfaceC9441ws2 interfaceC9441ws2 = (InterfaceC9441ws2) this.c.get(str);
        if (interfaceC9441ws2 != null) {
            return new C2786Xq2(interfaceC9441ws2, new WN2() { // from class: com.daaw.p42
                @Override // com.daaw.WN2
                public final Object apply(Object obj) {
                    return new C7815r42((List) obj);
                }
            });
        }
        InterfaceC2682Wq2 interfaceC2682Wq22 = (InterfaceC2682Wq2) this.b.get(str);
        if (interfaceC2682Wq22 == null) {
            return null;
        }
        return C7815r42.a(interfaceC2682Wq22);
    }
}

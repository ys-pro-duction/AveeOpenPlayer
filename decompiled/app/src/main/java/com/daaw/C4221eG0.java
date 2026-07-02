package com.daaw;

import com.daaw.InterfaceC8956v80;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.eG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4221eG0 implements InterfaceC8956v80 {
    public final ClassLoader a;
    public final C1060Hh b;

    public C4221eG0(ClassLoader classLoader) {
        G10.g(classLoader, "classLoader");
        this.a = classLoader;
        this.b = new C1060Hh();
    }

    @Override // com.daaw.InterfaceC8956v80
    public InterfaceC8956v80.a a(C6607ml c6607ml, C4740g50 c4740g50) {
        G10.g(c6607ml, "classId");
        G10.g(c4740g50, "jvmMetadataVersion");
        return d(AbstractC4500fG0.b(c6607ml));
    }

    @Override // com.daaw.InterfaceC8956v80
    public InterfaceC8956v80.a b(C20 c20, C4740g50 c4740g50) {
        String strB;
        G10.g(c20, "javaClass");
        G10.g(c4740g50, "jvmMetadataVersion");
        AP apD = c20.d();
        if (apD == null || (strB = apD.b()) == null) {
            return null;
        }
        return d(strB);
    }

    @Override // com.daaw.C80
    public InputStream c(AP ap) {
        G10.g(ap, "packageFqName");
        if (ap.i(YV0.z)) {
            return this.b.a(C10220zh.r.r(ap));
        }
        return null;
    }

    public final InterfaceC8956v80.a d(String str) {
        C3943dG0 c3943dG0A;
        Class clsA = KF0.a(this.a, str);
        if (clsA == null || (c3943dG0A = C3943dG0.c.a(clsA)) == null) {
            return null;
        }
        return new InterfaceC8956v80.a.C0241a(c3943dG0A, null, 2, null);
    }
}

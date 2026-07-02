package com.daaw;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.daaw.Fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0852Fh extends AbstractC9248wB implements InterfaceC0748Eh {
    public static final a P = new a(null);
    public final boolean O;

    /* JADX INFO: renamed from: com.daaw.Fh$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C0852Fh a(AP ap, InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0, InputStream inputStream, boolean z) throws IllegalAccessException, IOException, InvocationTargetException {
            G10.g(ap, "fqName");
            G10.g(interfaceC10174zX0, "storageManager");
            G10.g(interfaceC2968Zk0, "module");
            G10.g(inputStream, "inputStream");
            C0576Cs0 c0576Cs0A = GE0.a(inputStream);
            GA0 ga0 = (GA0) c0576Cs0A.a();
            C0323Ah c0323Ah = (C0323Ah) c0576Cs0A.b();
            if (ga0 != null) {
                return new C0852Fh(ap, interfaceC10174zX0, interfaceC2968Zk0, ga0, c0323Ah, z, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + C0323Ah.h + ", actual " + c0323Ah + ". Please update Kotlin");
        }

        public a() {
        }
    }

    public /* synthetic */ C0852Fh(AP ap, InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0, GA0 ga0, C0323Ah c0323Ah, boolean z, AbstractC2911Yw abstractC2911Yw) {
        this(ap, interfaceC10174zX0, interfaceC2968Zk0, ga0, c0323Ah, z);
    }

    @Override // com.daaw.AbstractC2476Ur0, com.daaw.AbstractC8898uw
    public String toString() {
        return "builtins package fragment for " + d() + " from " + AbstractC8400tA.s(this);
    }

    public C0852Fh(AP ap, InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0, GA0 ga0, C0323Ah c0323Ah, boolean z) {
        super(ap, interfaceC10174zX0, interfaceC2968Zk0, ga0, c0323Ah, null);
        this.O = z;
    }
}

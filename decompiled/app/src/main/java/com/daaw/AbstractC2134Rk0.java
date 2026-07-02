package com.daaw;

/* JADX INFO: renamed from: com.daaw.Rk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2134Rk0 implements InterfaceC4923gl {
    public static final a B = new a(null);

    /* JADX INFO: renamed from: com.daaw.Rk0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final InterfaceC4346ej0 a(InterfaceC4923gl interfaceC4923gl, AbstractC8392t81 abstractC8392t81, Q80 q80) {
            InterfaceC4346ej0 interfaceC4346ej0F;
            G10.g(interfaceC4923gl, "<this>");
            G10.g(abstractC8392t81, "typeSubstitution");
            G10.g(q80, "kotlinTypeRefiner");
            AbstractC2134Rk0 abstractC2134Rk0 = interfaceC4923gl instanceof AbstractC2134Rk0 ? (AbstractC2134Rk0) interfaceC4923gl : null;
            if (abstractC2134Rk0 != null && (interfaceC4346ej0F = abstractC2134Rk0.F(abstractC8392t81, q80)) != null) {
                return interfaceC4346ej0F;
            }
            InterfaceC4346ej0 interfaceC4346ej0G0 = interfaceC4923gl.G0(abstractC8392t81);
            G10.f(interfaceC4346ej0G0, "getMemberScope(...)");
            return interfaceC4346ej0G0;
        }

        public final InterfaceC4346ej0 b(InterfaceC4923gl interfaceC4923gl, Q80 q80) {
            InterfaceC4346ej0 interfaceC4346ej0U;
            G10.g(interfaceC4923gl, "<this>");
            G10.g(q80, "kotlinTypeRefiner");
            AbstractC2134Rk0 abstractC2134Rk0 = interfaceC4923gl instanceof AbstractC2134Rk0 ? (AbstractC2134Rk0) interfaceC4923gl : null;
            if (abstractC2134Rk0 != null && (interfaceC4346ej0U = abstractC2134Rk0.U(q80)) != null) {
                return interfaceC4346ej0U;
            }
            InterfaceC4346ej0 interfaceC4346ej0C0 = interfaceC4923gl.C0();
            G10.f(interfaceC4346ej0C0, "getUnsubstitutedMemberScope(...)");
            return interfaceC4346ej0C0;
        }

        public a() {
        }
    }

    public abstract InterfaceC4346ej0 F(AbstractC8392t81 abstractC8392t81, Q80 q80);

    public abstract InterfaceC4346ej0 U(Q80 q80);
}

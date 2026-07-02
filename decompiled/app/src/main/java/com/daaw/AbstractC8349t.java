package com.daaw;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8349t extends AbstractC2134Rk0 {
    public final C2352Tm0 C;
    public final InterfaceC0881Fo0 D;
    public final InterfaceC0881Fo0 E;
    public final InterfaceC0881Fo0 F;

    /* JADX INFO: renamed from: com.daaw.t$a */
    public class a implements LQ {

        /* JADX INFO: renamed from: com.daaw.t$a$a, reason: collision with other inner class name */
        public class C0234a implements NQ {
            public C0234a() {
            }

            @Override // com.daaw.NQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public YS0 invoke(Q80 q80) {
                InterfaceC10240zl interfaceC10240zlF = q80.f(AbstractC8349t.this);
                return interfaceC10240zlF == null ? (YS0) AbstractC8349t.this.D.invoke() : interfaceC10240zlF instanceof InterfaceC5586j71 ? M80.c((InterfaceC5586j71) interfaceC10240zlF, D81.g(interfaceC10240zlF.k().getParameters())) : interfaceC10240zlF instanceof AbstractC2134Rk0 ? D81.v(interfaceC10240zlF.k().a(q80), ((AbstractC2134Rk0) interfaceC10240zlF).U(q80), this) : interfaceC10240zlF.s();
            }
        }

        public a() {
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public YS0 invoke() {
            AbstractC8349t abstractC8349t = AbstractC8349t.this;
            return D81.u(abstractC8349t, abstractC8349t.C0(), new C0234a());
        }
    }

    /* JADX INFO: renamed from: com.daaw.t$b */
    public class b implements LQ {
        public b() {
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC4346ej0 invoke() {
            return new MZ(AbstractC8349t.this.C0());
        }
    }

    /* JADX INFO: renamed from: com.daaw.t$c */
    public class c implements LQ {
        public c() {
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RE0 invoke() {
            return new Q90(AbstractC8349t.this);
        }
    }

    public AbstractC8349t(InterfaceC10174zX0 interfaceC10174zX0, C2352Tm0 c2352Tm0) {
        if (interfaceC10174zX0 == null) {
            y0(0);
        }
        if (c2352Tm0 == null) {
            y0(1);
        }
        this.C = c2352Tm0;
        this.D = interfaceC10174zX0.h(new a());
        this.E = interfaceC10174zX0.h(new b());
        this.F = interfaceC10174zX0.h(new c());
    }

    private static /* synthetic */ void y0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4346ej0 C0() {
        InterfaceC4346ej0 interfaceC4346ej0U = U(AbstractC8400tA.r(AbstractC7006oA.g(this)));
        if (interfaceC4346ej0U == null) {
            y0(17);
        }
        return interfaceC4346ej0U;
    }

    @Override // com.daaw.AbstractC2134Rk0
    public InterfaceC4346ej0 F(AbstractC8392t81 abstractC8392t81, Q80 q80) {
        if (abstractC8392t81 == null) {
            y0(10);
        }
        if (q80 == null) {
            y0(11);
        }
        if (!abstractC8392t81.f()) {
            return new C6270lZ0(U(q80), C8957v81.g(abstractC8392t81));
        }
        InterfaceC4346ej0 interfaceC4346ej0U = U(q80);
        if (interfaceC4346ej0U == null) {
            y0(12);
        }
        return interfaceC4346ej0U;
    }

    @Override // com.daaw.InterfaceC4297eZ0
    /* JADX INFO: renamed from: F0 */
    public InterfaceC4923gl c(C8957v81 c8957v81) {
        if (c8957v81 == null) {
            y0(18);
        }
        return c8957v81.k() ? this : new C7116ob0(this, c8957v81);
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4346ej0 G0(AbstractC8392t81 abstractC8392t81) {
        if (abstractC8392t81 == null) {
            y0(15);
        }
        InterfaceC4346ej0 interfaceC4346ej0F = F(abstractC8392t81, AbstractC8400tA.r(AbstractC7006oA.g(this)));
        if (interfaceC4346ej0F == null) {
            y0(16);
        }
        return interfaceC4346ej0F;
    }

    @Override // com.daaw.InterfaceC4923gl
    public List H0() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            y0(6);
        }
        return list;
    }

    @Override // com.daaw.InterfaceC4923gl
    public RE0 J0() {
        RE0 re0 = (RE0) this.F.invoke();
        if (re0 == null) {
            y0(5);
        }
        return re0;
    }

    @Override // com.daaw.InterfaceC3809cn0
    public C2352Tm0 getName() {
        C2352Tm0 c2352Tm0 = this.C;
        if (c2352Tm0 == null) {
            y0(2);
        }
        return c2352Tm0;
    }

    @Override // com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        return interfaceC9735xw.l(this, obj);
    }

    @Override // com.daaw.InterfaceC4923gl, com.daaw.InterfaceC10240zl
    public YS0 s() {
        YS0 ys0 = (YS0) this.D.invoke();
        if (ys0 == null) {
            y0(20);
        }
        return ys0;
    }

    @Override // com.daaw.InterfaceC4923gl
    public InterfaceC4346ej0 w0() {
        InterfaceC4346ej0 interfaceC4346ej0 = (InterfaceC4346ej0) this.E.invoke();
        if (interfaceC4346ej0 == null) {
            y0(4);
        }
        return interfaceC4346ej0;
    }

    @Override // com.daaw.InterfaceC8612tw
    public InterfaceC4923gl a() {
        return this;
    }
}

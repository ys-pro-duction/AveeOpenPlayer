package com.daaw;

import com.daaw.AbstractC3894d50;
import com.daaw.AbstractC4451f50;
import com.daaw.AbstractC5674jS;
import com.daaw.AbstractC7261p50;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.o50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6982o50 {

    /* JADX INFO: renamed from: com.daaw.o50$a */
    public static final class a extends AbstractC6982o50 {
        public final Field a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            G10.g(field, "field");
            this.a = field;
        }

        @Override // com.daaw.AbstractC6982o50
        public String a() {
            StringBuilder sb = new StringBuilder();
            String name = this.a.getName();
            G10.f(name, "getName(...)");
            sb.append(C10052z40.b(name));
            sb.append("()");
            Class<?> type = this.a.getType();
            G10.f(type, "getType(...)");
            sb.append(AbstractC9544xF0.f(type));
            return sb.toString();
        }

        public final Field b() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.o50$b */
    public static final class b extends AbstractC6982o50 {
        public final Method a;
        public final Method b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method method, Method method2) {
            super(null);
            G10.g(method, "getterMethod");
            this.a = method;
            this.b = method2;
        }

        @Override // com.daaw.AbstractC6982o50
        public String a() {
            return AbstractC10122zK0.d(this.a);
        }

        public final Method b() {
            return this.a;
        }

        public final Method c() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: com.daaw.o50$c */
    public static final class c extends AbstractC6982o50 {
        public final InterfaceC4476fA0 a;
        public final HA0 b;
        public final AbstractC7261p50.d c;
        public final InterfaceC2664Wm0 d;
        public final B81 e;
        public final String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4476fA0 interfaceC4476fA0, HA0 ha0, AbstractC7261p50.d dVar, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81) {
            String str;
            super(null);
            G10.g(interfaceC4476fA0, "descriptor");
            G10.g(ha0, "proto");
            G10.g(dVar, "signature");
            G10.g(interfaceC2664Wm0, "nameResolver");
            G10.g(b81, "typeTable");
            this.a = interfaceC4476fA0;
            this.b = ha0;
            this.c = dVar;
            this.d = interfaceC2664Wm0;
            this.e = b81;
            if (dVar.J()) {
                str = interfaceC2664Wm0.getString(dVar.E().A()) + interfaceC2664Wm0.getString(dVar.E().z());
            } else {
                AbstractC4451f50.a aVarD = C7540q50.d(C7540q50.a, ha0, interfaceC2664Wm0, b81, false, 8, null);
                if (aVarD == null) {
                    throw new E80("No field signature for property: " + interfaceC4476fA0);
                }
                String strB = aVarD.b();
                str = C10052z40.b(strB) + c() + "()" + aVarD.c();
            }
            this.f = str;
        }

        @Override // com.daaw.AbstractC6982o50
        public String a() {
            return this.f;
        }

        public final InterfaceC4476fA0 b() {
            return this.a;
        }

        public final String c() {
            String string;
            InterfaceC8612tw interfaceC8612twB = this.a.b();
            G10.f(interfaceC8612twB, "getContainingDeclaration(...)");
            if (G10.c(this.a.getVisibility(), AbstractC8679uA.d) && (interfaceC8612twB instanceof QA)) {
                C9245wA0 c9245wA0E1 = ((QA) interfaceC8612twB).e1();
                AbstractC5674jS.f fVar = AbstractC7261p50.i;
                G10.f(fVar, "classModuleName");
                Integer num = (Integer) SA0.a(c9245wA0E1, fVar);
                if (num == null || (string = this.d.getString(num.intValue())) == null) {
                    string = "main";
                }
                return '$' + C3531bn0.b(string);
            }
            if (!G10.c(this.a.getVisibility(), AbstractC8679uA.a) || !(interfaceC8612twB instanceof InterfaceC2372Tr0)) {
                return "";
            }
            InterfaceC4476fA0 interfaceC4476fA0 = this.a;
            G10.e(interfaceC4476fA0, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            WA waA0 = ((C9806yB) interfaceC4476fA0).a0();
            if (!(waA0 instanceof C5857k50)) {
                return "";
            }
            C5857k50 c5857k50 = (C5857k50) waA0;
            if (c5857k50.f() == null) {
                return "";
            }
            return '$' + c5857k50.h().c();
        }

        public final InterfaceC2664Wm0 d() {
            return this.d;
        }

        public final HA0 e() {
            return this.b;
        }

        public final AbstractC7261p50.d f() {
            return this.c;
        }

        public final B81 g() {
            return this.e;
        }
    }

    /* JADX INFO: renamed from: com.daaw.o50$d */
    public static final class d extends AbstractC6982o50 {
        public final AbstractC3894d50.e a;
        public final AbstractC3894d50.e b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC3894d50.e eVar, AbstractC3894d50.e eVar2) {
            super(null);
            G10.g(eVar, "getterSignature");
            this.a = eVar;
            this.b = eVar2;
        }

        @Override // com.daaw.AbstractC6982o50
        public String a() {
            return this.a.a();
        }

        public final AbstractC3894d50.e b() {
            return this.a;
        }

        public final AbstractC3894d50.e c() {
            return this.b;
        }
    }

    public /* synthetic */ AbstractC6982o50(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    public abstract String a();

    public AbstractC6982o50() {
    }
}

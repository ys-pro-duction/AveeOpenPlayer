package com.daaw;

import com.daaw.C10197zc1;
import com.daaw.InterfaceC1376Ki;
import com.daaw.InterfaceC1583Mi;
import com.daaw.InterfaceC8468tR;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.uR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8747uR extends AbstractC9456ww implements InterfaceC8468tR {
    public List F;
    public List G;
    public I80 H;
    public List I;
    public RE0 J;
    public RE0 K;
    public EnumC0336Ak0 L;
    public AbstractC8965vA M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public Collection Z;
    public volatile LQ a0;
    public final InterfaceC8468tR b0;
    public final InterfaceC1583Mi.a c0;
    public InterfaceC8468tR d0;
    public Map e0;

    /* JADX INFO: renamed from: com.daaw.uR$a */
    public class a implements LQ {
        public final /* synthetic */ C8957v81 B;

        public a(C8957v81 c8957v81) {
            this.B = c8957v81;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection invoke() {
            UT0 ut0 = new UT0();
            Iterator it = AbstractC8747uR.this.e().iterator();
            while (it.hasNext()) {
                ut0.add(((InterfaceC8468tR) it.next()).c(this.B));
            }
            return ut0;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uR$b */
    public static class b implements LQ {
        public final /* synthetic */ List B;

        public b(List list) {
            this.B = list;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List invoke() {
            return this.B;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uR$c */
    public class c implements InterfaceC8468tR.a {
        public AbstractC8392t81 a;
        public InterfaceC8612tw b;
        public EnumC0336Ak0 c;
        public AbstractC8965vA d;
        public InterfaceC8468tR e;
        public InterfaceC1583Mi.a f;
        public List g;
        public List h;
        public RE0 i;
        public RE0 j;
        public I80 k;
        public C2352Tm0 l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public List r;
        public InterfaceC3072a8 s;
        public boolean t;
        public Map u;
        public Boolean v;
        public boolean w;
        public final /* synthetic */ AbstractC8747uR x;

        public c(AbstractC8747uR abstractC8747uR, AbstractC8392t81 abstractC8392t81, InterfaceC8612tw interfaceC8612tw, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, InterfaceC1583Mi.a aVar, List list, List list2, RE0 re0, I80 i80, C2352Tm0 c2352Tm0) {
            if (abstractC8392t81 == null) {
                v(0);
            }
            if (interfaceC8612tw == null) {
                v(1);
            }
            if (enumC0336Ak0 == null) {
                v(2);
            }
            if (abstractC8965vA == null) {
                v(3);
            }
            if (aVar == null) {
                v(4);
            }
            if (list == null) {
                v(5);
            }
            if (list2 == null) {
                v(6);
            }
            if (i80 == null) {
                v(7);
            }
            this.x = abstractC8747uR;
            this.e = null;
            this.j = abstractC8747uR.K;
            this.m = true;
            this.n = false;
            this.o = false;
            this.p = false;
            this.q = abstractC8747uR.u0();
            this.r = null;
            this.s = null;
            this.t = abstractC8747uR.B0();
            this.u = new LinkedHashMap();
            this.v = null;
            this.w = false;
            this.a = abstractC8392t81;
            this.b = interfaceC8612tw;
            this.c = enumC0336Ak0;
            this.d = abstractC8965vA;
            this.f = aVar;
            this.g = list;
            this.h = list2;
            this.i = re0;
            this.k = i80;
            this.l = c2352Tm0;
        }

        public static /* synthetic */ void v(int i) {
            String str;
            int i2;
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i2 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case 14:
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public c r(InterfaceC3072a8 interfaceC3072a8) {
            if (interfaceC3072a8 == null) {
                v(35);
            }
            this.s = interfaceC3072a8;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public c k(boolean z) {
            this.m = z;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public c n(RE0 re0) {
            this.j = re0;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public c b() {
            this.p = true;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public c p(RE0 re0) {
            this.i = re0;
            return this;
        }

        public c H(boolean z) {
            this.v = Boolean.valueOf(z);
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public c j() {
            this.t = true;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public c q() {
            this.q = true;
            return this;
        }

        public c K(boolean z) {
            this.w = z;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public c g(InterfaceC1583Mi.a aVar) {
            if (aVar == null) {
                v(14);
            }
            this.f = aVar;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public c f(EnumC0336Ak0 enumC0336Ak0) {
            if (enumC0336Ak0 == null) {
                v(10);
            }
            this.c = enumC0336Ak0;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public c i(C2352Tm0 c2352Tm0) {
            if (c2352Tm0 == null) {
                v(17);
            }
            this.l = c2352Tm0;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public c m(InterfaceC1583Mi interfaceC1583Mi) {
            this.e = (InterfaceC8468tR) interfaceC1583Mi;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public c d(InterfaceC8612tw interfaceC8612tw) {
            if (interfaceC8612tw == null) {
                v(8);
            }
            this.b = interfaceC8612tw;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public c h() {
            this.o = true;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public c l(I80 i80) {
            if (i80 == null) {
                v(23);
            }
            this.k = i80;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public c u() {
            this.n = true;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public c t(AbstractC8392t81 abstractC8392t81) {
            if (abstractC8392t81 == null) {
                v(37);
            }
            this.a = abstractC8392t81;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public c o(List list) {
            if (list == null) {
                v(21);
            }
            this.r = list;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public c c(List list) {
            if (list == null) {
                v(19);
            }
            this.g = list;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public c e(AbstractC8965vA abstractC8965vA) {
            if (abstractC8965vA == null) {
                v(12);
            }
            this.d = abstractC8965vA;
            return this;
        }

        @Override // com.daaw.InterfaceC8468tR.a
        public InterfaceC8468tR a() {
            return this.x.M0(this);
        }

        @Override // com.daaw.InterfaceC8468tR.a
        public InterfaceC8468tR.a s(InterfaceC1376Ki.a aVar, Object obj) {
            if (aVar == null) {
                v(39);
            }
            this.u.put(aVar, obj);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8747uR(InterfaceC8612tw interfaceC8612tw, InterfaceC8468tR interfaceC8468tR, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, InterfaceC1583Mi.a aVar, RU0 ru0) {
        super(interfaceC8612tw, interfaceC3072a8, c2352Tm0, ru0);
        if (interfaceC8612tw == null) {
            F(0);
        }
        if (interfaceC3072a8 == null) {
            F(1);
        }
        if (c2352Tm0 == null) {
            F(2);
        }
        if (aVar == null) {
            F(3);
        }
        if (ru0 == null) {
            F(4);
        }
        this.M = AbstractC8679uA.i;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = true;
        this.Y = false;
        this.Z = null;
        this.a0 = null;
        this.d0 = null;
        this.e0 = null;
        this.b0 = interfaceC8468tR == null ? this : interfaceC8468tR;
        this.c0 = aVar;
    }

    private static /* synthetic */ void F(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static List O0(InterfaceC8468tR interfaceC8468tR, List list, C8957v81 c8957v81) {
        if (list == null) {
            F(28);
        }
        if (c8957v81 == null) {
            F(29);
        }
        return P0(interfaceC8468tR, list, c8957v81, false, false, null);
    }

    public static List P0(InterfaceC8468tR interfaceC8468tR, List list, C8957v81 c8957v81, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            F(30);
        }
        if (c8957v81 == null) {
            F(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC9918yc1 interfaceC9918yc1 = (InterfaceC9918yc1) it.next();
            I80 type = interfaceC9918yc1.getType();
            EnumC1042Hc1 enumC1042Hc1 = EnumC1042Hc1.G;
            I80 i80P = c8957v81.p(type, enumC1042Hc1);
            I80 i80G0 = interfaceC9918yc1.g0();
            I80 i80P2 = i80G0 == null ? null : c8957v81.p(i80G0, enumC1042Hc1);
            if (i80P == null) {
                return null;
            }
            if ((i80P != interfaceC9918yc1.getType() || i80G0 != i80P2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(C10197zc1.K0(interfaceC8468tR, z ? null : interfaceC9918yc1, interfaceC9918yc1.getIndex(), interfaceC9918yc1.getAnnotations(), interfaceC9918yc1.getName(), i80P, interfaceC9918yc1.s0(), interfaceC9918yc1.Z(), interfaceC9918yc1.V(), i80P2, z2 ? interfaceC9918yc1.j() : RU0.a, interfaceC9918yc1 instanceof C10197zc1.b ? new b(((C10197zc1.b) interfaceC9918yc1).P0()) : null));
        }
        return arrayList;
    }

    private void d1(InterfaceC8468tR interfaceC8468tR) {
        this.d0 = interfaceC8468tR;
    }

    @Override // com.daaw.InterfaceC8468tR
    public boolean B0() {
        return this.V;
    }

    public boolean E() {
        return this.Y;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean E0() {
        return this.T;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean J() {
        return this.S;
    }

    public InterfaceC8468tR K0(InterfaceC8612tw interfaceC8612tw, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, InterfaceC1583Mi.a aVar, boolean z) {
        InterfaceC8468tR interfaceC8468tRA = t().d(interfaceC8612tw).f(enumC0336Ak0).e(abstractC8965vA).g(aVar).k(z).a();
        if (interfaceC8468tRA == null) {
            F(26);
        }
        return interfaceC8468tRA;
    }

    /* JADX INFO: renamed from: L0 */
    public abstract AbstractC8747uR o1(InterfaceC8612tw interfaceC8612tw, InterfaceC8468tR interfaceC8468tR, InterfaceC1583Mi.a aVar, C2352Tm0 c2352Tm0, InterfaceC3072a8 interfaceC3072a8, RU0 ru0);

    public boolean M() {
        return this.R;
    }

    public InterfaceC8468tR M0(c cVar) {
        SE0 se0;
        InterfaceC8468tR interfaceC8468tR;
        I80 i80P;
        if (cVar == null) {
            F(25);
        }
        boolean[] zArr = new boolean[1];
        InterfaceC3072a8 interfaceC3072a8A = cVar.s != null ? AbstractC3908d8.a(getAnnotations(), cVar.s) : getAnnotations();
        InterfaceC8612tw interfaceC8612tw = cVar.b;
        InterfaceC8468tR interfaceC8468tR2 = cVar.e;
        AbstractC8747uR abstractC8747uRL0 = o1(interfaceC8612tw, interfaceC8468tR2, cVar.f, cVar.l, interfaceC3072a8A, N0(cVar.o, interfaceC8468tR2));
        List typeParameters = cVar.r == null ? getTypeParameters() : cVar.r;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        C8957v81 c8957v81C = AbstractC6448mA.c(typeParameters, cVar.a, abstractC8747uRL0, arrayList, zArr);
        RE0 re0 = null;
        if (c8957v81C == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.h.isEmpty()) {
            int i = 0;
            for (RE0 re02 : cVar.h) {
                I80 i80P2 = c8957v81C.p(re02.getType(), EnumC1042Hc1.G);
                if (i80P2 == null) {
                    return null;
                }
                int i2 = i + 1;
                arrayList2.add(AbstractC1444Kz.b(abstractC8747uRL0, i80P2, ((XY) re02.getValue()).a(), re02.getAnnotations(), i));
                zArr[0] = zArr[0] | (i80P2 != re02.getType());
                i = i2;
            }
        }
        RE0 re03 = cVar.i;
        if (re03 != null) {
            I80 i80P3 = c8957v81C.p(re03.getType(), EnumC1042Hc1.G);
            if (i80P3 == null) {
                return null;
            }
            SE0 se02 = new SE0(abstractC8747uRL0, new C5917kJ(abstractC8747uRL0, i80P3, cVar.i.getValue()), cVar.i.getAnnotations());
            zArr[0] = (i80P3 != cVar.i.getType()) | zArr[0];
            se0 = se02;
        } else {
            se0 = null;
        }
        RE0 re04 = cVar.j;
        if (re04 != null) {
            RE0 re0C = re04.c(c8957v81C);
            if (re0C == null) {
                return null;
            }
            zArr[0] = zArr[0] | (re0C != cVar.j);
            interfaceC8468tR = null;
            re0 = re0C;
        } else {
            interfaceC8468tR = null;
        }
        List listP0 = P0(abstractC8747uRL0, cVar.g, c8957v81C, cVar.p, cVar.o, zArr);
        if (listP0 == null || (i80P = c8957v81C.p(cVar.k, EnumC1042Hc1.H)) == null) {
            return interfaceC8468tR;
        }
        boolean z = zArr[0] | (i80P != cVar.k);
        zArr[0] = z;
        if (!z && cVar.w) {
            return this;
        }
        abstractC8747uRL0.R0(se0, re0, arrayList2, arrayList, listP0, i80P, cVar.c, cVar.d);
        abstractC8747uRL0.f1(this.N);
        abstractC8747uRL0.c1(this.O);
        abstractC8747uRL0.X0(this.P);
        abstractC8747uRL0.e1(this.Q);
        abstractC8747uRL0.i1(this.R);
        abstractC8747uRL0.h1(this.W);
        abstractC8747uRL0.W0(this.S);
        abstractC8747uRL0.V0(this.T);
        abstractC8747uRL0.Y0(this.X);
        abstractC8747uRL0.b1(cVar.q);
        abstractC8747uRL0.a1(cVar.t);
        abstractC8747uRL0.Z0(cVar.v != null ? cVar.v.booleanValue() : this.Y);
        if (!cVar.u.isEmpty() || this.e0 != null) {
            Map map = cVar.u;
            Map map2 = this.e0;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                abstractC8747uRL0.e0 = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                abstractC8747uRL0.e0 = map;
            }
        }
        if (cVar.n || b0() != null) {
            abstractC8747uRL0.d1((b0() != null ? b0() : this).c(c8957v81C));
        }
        if (cVar.m && !a().e().isEmpty()) {
            if (cVar.a.f()) {
                LQ lq = this.a0;
                if (lq != null) {
                    abstractC8747uRL0.a0 = lq;
                    return abstractC8747uRL0;
                }
                abstractC8747uRL0.v0(e());
                return abstractC8747uRL0;
            }
            abstractC8747uRL0.a0 = new a(c8957v81C);
        }
        return abstractC8747uRL0;
    }

    public final RU0 N0(boolean z, InterfaceC8468tR interfaceC8468tR) {
        RU0 ru0J;
        if (z) {
            if (interfaceC8468tR == null) {
                interfaceC8468tR = a();
            }
            ru0J = interfaceC8468tR.j();
        } else {
            ru0J = RU0.a;
        }
        if (ru0J == null) {
            F(27);
        }
        return ru0J;
    }

    public boolean Q0() {
        return this.X;
    }

    public AbstractC8747uR R0(RE0 re0, RE0 re02, List list, List list2, List list3, I80 i80, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA) {
        if (list == null) {
            F(5);
        }
        if (list2 == null) {
            F(6);
        }
        if (list3 == null) {
            F(7);
        }
        if (abstractC8965vA == null) {
            F(8);
        }
        this.F = AbstractC2455Um.M0(list2);
        this.G = AbstractC2455Um.M0(list3);
        this.H = i80;
        this.L = enumC0336Ak0;
        this.M = abstractC8965vA;
        this.J = re0;
        this.K = re02;
        this.I = list;
        for (int i = 0; i < list2.size(); i++) {
            Z71 z71 = (Z71) list2.get(i);
            if (z71.getIndex() != i) {
                throw new IllegalStateException(z71 + " index is " + z71.getIndex() + " but position is " + i);
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            InterfaceC9918yc1 interfaceC9918yc1 = (InterfaceC9918yc1) list3.get(i2);
            if (interfaceC9918yc1.getIndex() != i2) {
                throw new IllegalStateException(interfaceC9918yc1 + "index is " + interfaceC9918yc1.getIndex() + " but position is " + i2);
            }
        }
        return this;
    }

    public c S0(C8957v81 c8957v81) {
        if (c8957v81 == null) {
            F(24);
        }
        return new c(this, c8957v81.j(), b(), l(), getVisibility(), i(), h(), o0(), i0(), getReturnType(), null);
    }

    public final void T0() {
        LQ lq = this.a0;
        if (lq != null) {
            this.Z = (Collection) lq.invoke();
            this.a0 = null;
        }
    }

    public void U0(InterfaceC1376Ki.a aVar, Object obj) {
        if (this.e0 == null) {
            this.e0 = new LinkedHashMap();
        }
        this.e0.put(aVar, obj);
    }

    public void V0(boolean z) {
        this.T = z;
    }

    public void W0(boolean z) {
        this.S = z;
    }

    public Object X(InterfaceC1376Ki.a aVar) {
        Map map = this.e0;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    public void X0(boolean z) {
        this.P = z;
    }

    public void Y0(boolean z) {
        this.X = z;
    }

    public void Z0(boolean z) {
        this.Y = z;
    }

    @Override // com.daaw.AbstractC9456ww, com.daaw.AbstractC8898uw, com.daaw.InterfaceC8612tw
    public InterfaceC8468tR a() {
        InterfaceC8468tR interfaceC8468tR = this.b0;
        InterfaceC8468tR interfaceC8468tRA = interfaceC8468tR == this ? this : interfaceC8468tR.a();
        if (interfaceC8468tRA == null) {
            F(20);
        }
        return interfaceC8468tRA;
    }

    public final void a1(boolean z) {
        this.V = z;
    }

    @Override // com.daaw.InterfaceC8468tR
    public InterfaceC8468tR b0() {
        return this.d0;
    }

    public final void b1(boolean z) {
        this.U = z;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public RE0 c0() {
        return this.K;
    }

    public void c1(boolean z) {
        this.O = z;
    }

    public Collection e() {
        T0();
        Collection collection = this.Z;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            F(14);
        }
        return collection;
    }

    public void e1(boolean z) {
        this.Q = z;
    }

    public void f1(boolean z) {
        this.N = z;
    }

    public void g1(I80 i80) {
        if (i80 == null) {
            F(11);
        }
        this.H = i80;
    }

    public I80 getReturnType() {
        return this.H;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public List getTypeParameters() {
        List list = this.F;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // com.daaw.InterfaceC0383Aw
    public AbstractC8965vA getVisibility() {
        AbstractC8965vA abstractC8965vA = this.M;
        if (abstractC8965vA == null) {
            F(16);
        }
        return abstractC8965vA;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public List h() {
        List list = this.G;
        if (list == null) {
            F(19);
        }
        return list;
    }

    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        return interfaceC9735xw.f(this, obj);
    }

    public void h1(boolean z) {
        this.W = z;
    }

    @Override // com.daaw.InterfaceC1583Mi
    public InterfaceC1583Mi.a i() {
        InterfaceC1583Mi.a aVar = this.c0;
        if (aVar == null) {
            F(21);
        }
        return aVar;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public RE0 i0() {
        return this.J;
    }

    public void i1(boolean z) {
        this.R = z;
    }

    public boolean isExternal() {
        return this.P;
    }

    @Override // com.daaw.InterfaceC8468tR
    public boolean isInfix() {
        if (this.O) {
            return true;
        }
        Iterator it = a().e().iterator();
        while (it.hasNext()) {
            if (((InterfaceC8468tR) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.Q;
    }

    @Override // com.daaw.InterfaceC8468tR
    public boolean isOperator() {
        if (this.N) {
            return true;
        }
        Iterator it = a().e().iterator();
        while (it.hasNext()) {
            if (((InterfaceC8468tR) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.W;
    }

    public void j1(AbstractC8965vA abstractC8965vA) {
        if (abstractC8965vA == null) {
            F(10);
        }
        this.M = abstractC8965vA;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public EnumC0336Ak0 l() {
        EnumC0336Ak0 enumC0336Ak0 = this.L;
        if (enumC0336Ak0 == null) {
            F(15);
        }
        return enumC0336Ak0;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public List o0() {
        List list = this.I;
        if (list == null) {
            F(13);
        }
        return list;
    }

    public InterfaceC8468tR.a t() {
        c cVarS0 = S0(C8957v81.b);
        if (cVarS0 == null) {
            F(23);
        }
        return cVarS0;
    }

    @Override // com.daaw.InterfaceC8468tR
    public boolean u0() {
        return this.U;
    }

    public void v0(Collection collection) {
        if (collection == null) {
            F(17);
        }
        this.Z = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC8468tR) it.next()).B0()) {
                this.V = true;
                return;
            }
        }
    }

    @Override // com.daaw.InterfaceC4297eZ0
    public InterfaceC8468tR c(C8957v81 c8957v81) {
        if (c8957v81 == null) {
            F(22);
        }
        return c8957v81.k() ? this : S0(c8957v81).m(a()).h().K(true).a();
    }
}

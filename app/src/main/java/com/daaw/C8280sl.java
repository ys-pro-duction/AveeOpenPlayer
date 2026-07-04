package com.daaw;

import com.daaw.InterfaceC9624xZ0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.sl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C8280sl extends AbstractC8628u {
    public final InterfaceC4923gl d;
    public final List e;
    public final Collection f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8280sl(InterfaceC4923gl interfaceC4923gl, List list, Collection collection, InterfaceC10174zX0 interfaceC10174zX0) {
        super(interfaceC10174zX0);
        if (interfaceC4923gl == null) {
            H(0);
        }
        if (list == null) {
            H(1);
        }
        if (collection == null) {
            H(2);
        }
        if (interfaceC10174zX0 == null) {
            H(3);
        }
        this.d = interfaceC4923gl;
        this.e = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.f = DesugarCollections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void H(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // com.daaw.AbstractC9961yl, com.daaw.C71
    /* JADX INFO: renamed from: I */
    public InterfaceC4923gl c() {
        InterfaceC4923gl interfaceC4923gl = this.d;
        if (interfaceC4923gl == null) {
            H(5);
        }
        return interfaceC4923gl;
    }

    @Override // com.daaw.C71
    public boolean d() {
        return true;
    }

    @Override // com.daaw.C71
    public List getParameters() {
        List list = this.e;
        if (list == null) {
            H(4);
        }
        return list;
    }

    @Override // com.daaw.W0
    public Collection r() {
        Collection collection = this.f;
        if (collection == null) {
            H(6);
        }
        return collection;
    }

    public String toString() {
        return AbstractC7006oA.m(this.d).b();
    }

    @Override // com.daaw.W0
    public InterfaceC9624xZ0 v() {
        InterfaceC9624xZ0.a aVar = InterfaceC9624xZ0.a.a;
        if (aVar == null) {
            H(7);
        }
        return aVar;
    }
}

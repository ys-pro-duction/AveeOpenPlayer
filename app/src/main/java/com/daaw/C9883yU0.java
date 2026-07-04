package com.daaw;

import com.daaw.AbstractC3720cU0;
import com.daaw.InterfaceC5248hu0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.yU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9883yU0 implements Map, InterfaceC10170zW0, B60 {
    public AW0 B = new a(AbstractC7878rJ.a());
    public final Set C = new C5403iU0(this);
    public final Set D = new C5683jU0(this);
    public final Collection E = new C6250lU0(this);

    /* JADX INFO: renamed from: com.daaw.yU0$a */
    public static final class a extends AW0 {
        public InterfaceC5248hu0 c;
        public int d;

        public a(InterfaceC5248hu0 interfaceC5248hu0) {
            G10.g(interfaceC5248hu0, "map");
            this.c = interfaceC5248hu0;
        }

        @Override // com.daaw.AW0
        public void a(AW0 aw0) {
            G10.g(aw0, "value");
            a aVar = (a) aw0;
            synchronized (AbstractC10162zU0.a) {
                this.c = aVar.c;
                this.d = aVar.d;
                G91 g91 = G91.a;
            }
        }

        @Override // com.daaw.AW0
        public AW0 b() {
            return new a(this.c);
        }

        public final InterfaceC5248hu0 g() {
            return this.c;
        }

        public final int h() {
            return this.d;
        }

        public final void i(InterfaceC5248hu0 interfaceC5248hu0) {
            G10.g(interfaceC5248hu0, "<set-?>");
            this.c = interfaceC5248hu0;
        }

        public final void j(int i) {
            this.d = i;
        }
    }

    public Set b() {
        return this.C;
    }

    public Set c() {
        return this.D;
    }

    @Override // java.util.Map
    public void clear() {
        AbstractC3720cU0 abstractC3720cU0B;
        a aVar = (a) e();
        AbstractC3720cU0.a aVar2 = AbstractC3720cU0.e;
        a aVar3 = (a) AbstractC5124hU0.A(aVar, aVar2.b());
        aVar3.g();
        InterfaceC5248hu0 interfaceC5248hu0A = AbstractC7878rJ.a();
        if (interfaceC5248hu0A != aVar3.g()) {
            synchronized (AbstractC10162zU0.a) {
                a aVar4 = (a) e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = aVar2.b();
                    a aVar5 = (a) AbstractC5124hU0.Z(aVar4, this, abstractC3720cU0B);
                    aVar5.i(interfaceC5248hu0A);
                    aVar5.j(aVar5.h() + 1);
                }
                AbstractC5124hU0.J(abstractC3720cU0B, this);
            }
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return f().g().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return f().g().containsValue(obj);
    }

    public final int d() {
        return f().h();
    }

    @Override // com.daaw.InterfaceC10170zW0
    public AW0 e() {
        return this.B;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return b();
    }

    public final a f() {
        return (a) AbstractC5124hU0.O((a) e(), this);
    }

    public int g() {
        return f().g().size();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return f().g().get(obj);
    }

    public Collection h() {
        return this.E;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return f().g().isEmpty();
    }

    public final boolean j(Object obj) {
        Object next;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (G10.c(((Map.Entry) next).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return c();
    }

    @Override // com.daaw.InterfaceC10170zW0
    public /* synthetic */ AW0 m(AW0 aw0, AW0 aw02, AW0 aw03) {
        return AbstractC9891yW0.a(this, aw0, aw02, aw03);
    }

    @Override // com.daaw.InterfaceC10170zW0
    public void p(AW0 aw0) {
        G10.g(aw0, "value");
        this.B = (a) aw0;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        AbstractC3720cU0.a aVar;
        InterfaceC5248hu0 interfaceC5248hu0G;
        int iH;
        Object objPut;
        AbstractC3720cU0 abstractC3720cU0B;
        boolean z;
        do {
            synchronized (AbstractC10162zU0.a) {
                a aVar2 = (a) e();
                aVar = AbstractC3720cU0.e;
                a aVar3 = (a) AbstractC5124hU0.A(aVar2, aVar.b());
                interfaceC5248hu0G = aVar3.g();
                iH = aVar3.h();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC5248hu0G);
            InterfaceC5248hu0.a aVarBuilder = interfaceC5248hu0G.builder();
            objPut = aVarBuilder.put(obj, obj2);
            InterfaceC5248hu0 interfaceC5248hu0A = aVarBuilder.a();
            if (G10.c(interfaceC5248hu0A, interfaceC5248hu0G)) {
                break;
            }
            synchronized (AbstractC10162zU0.a) {
                a aVar4 = (a) e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = aVar.b();
                    a aVar5 = (a) AbstractC5124hU0.Z(aVar4, this, abstractC3720cU0B);
                    if (aVar5.h() == iH) {
                        aVar5.i(interfaceC5248hu0A);
                        z = true;
                        aVar5.j(aVar5.h() + 1);
                    } else {
                        z = false;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, this);
            }
        } while (!z);
        return objPut;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        AbstractC3720cU0.a aVar;
        InterfaceC5248hu0 interfaceC5248hu0G;
        int iH;
        AbstractC3720cU0 abstractC3720cU0B;
        boolean z;
        G10.g(map, "from");
        do {
            synchronized (AbstractC10162zU0.a) {
                a aVar2 = (a) e();
                aVar = AbstractC3720cU0.e;
                a aVar3 = (a) AbstractC5124hU0.A(aVar2, aVar.b());
                interfaceC5248hu0G = aVar3.g();
                iH = aVar3.h();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC5248hu0G);
            InterfaceC5248hu0.a aVarBuilder = interfaceC5248hu0G.builder();
            aVarBuilder.putAll(map);
            InterfaceC5248hu0 interfaceC5248hu0A = aVarBuilder.a();
            if (G10.c(interfaceC5248hu0A, interfaceC5248hu0G)) {
                return;
            }
            synchronized (AbstractC10162zU0.a) {
                a aVar4 = (a) e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = aVar.b();
                    a aVar5 = (a) AbstractC5124hU0.Z(aVar4, this, abstractC3720cU0B);
                    if (aVar5.h() == iH) {
                        aVar5.i(interfaceC5248hu0A);
                        z = true;
                        aVar5.j(aVar5.h() + 1);
                    } else {
                        z = false;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, this);
            }
        } while (!z);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        AbstractC3720cU0.a aVar;
        InterfaceC5248hu0 interfaceC5248hu0G;
        int iH;
        Object objRemove;
        AbstractC3720cU0 abstractC3720cU0B;
        boolean z;
        do {
            synchronized (AbstractC10162zU0.a) {
                a aVar2 = (a) e();
                aVar = AbstractC3720cU0.e;
                a aVar3 = (a) AbstractC5124hU0.A(aVar2, aVar.b());
                interfaceC5248hu0G = aVar3.g();
                iH = aVar3.h();
                G91 g91 = G91.a;
            }
            G10.d(interfaceC5248hu0G);
            InterfaceC5248hu0.a aVarBuilder = interfaceC5248hu0G.builder();
            objRemove = aVarBuilder.remove(obj);
            InterfaceC5248hu0 interfaceC5248hu0A = aVarBuilder.a();
            if (G10.c(interfaceC5248hu0A, interfaceC5248hu0G)) {
                break;
            }
            synchronized (AbstractC10162zU0.a) {
                a aVar4 = (a) e();
                AbstractC5124hU0.D();
                synchronized (AbstractC5124hU0.C()) {
                    abstractC3720cU0B = aVar.b();
                    a aVar5 = (a) AbstractC5124hU0.Z(aVar4, this, abstractC3720cU0B);
                    if (aVar5.h() == iH) {
                        aVar5.i(interfaceC5248hu0A);
                        z = true;
                        aVar5.j(aVar5.h() + 1);
                    } else {
                        z = false;
                    }
                }
                AbstractC5124hU0.J(abstractC3720cU0B, this);
            }
        } while (!z);
        return objRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return h();
    }
}

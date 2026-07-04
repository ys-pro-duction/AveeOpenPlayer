package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Y43 implements InterfaceC7821r53 {
    public final U43 a;
    public final AbstractC9223w53 b;
    public final boolean c;
    public final V33 d;

    public Y43(AbstractC9223w53 abstractC9223w53, V33 v33, U43 u43) {
        this.b = abstractC9223w53;
        this.c = v33.h(u43);
        this.d = v33;
        this.a = u43;
    }

    public static Y43 i(AbstractC9223w53 abstractC9223w53, V33 v33, U43 u43) {
        return new Y43(abstractC9223w53, v33, u43);
    }

    @Override // com.daaw.InterfaceC7821r53
    public final int a(Object obj) {
        int iHashCode = this.b.d(obj).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // com.daaw.InterfaceC7821r53
    public final void b(Object obj) {
        this.b.m(obj);
        this.d.e(obj);
    }

    @Override // com.daaw.InterfaceC7821r53
    public final boolean c(Object obj) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.daaw.InterfaceC7821r53
    public final void d(Object obj, Object obj2) {
        AbstractC8379t53.x(this.b, obj, obj2);
        if (this.c) {
            this.d.a(obj2);
            throw null;
        }
    }

    @Override // com.daaw.InterfaceC7821r53
    public final boolean e(Object obj, Object obj2) {
        AbstractC9223w53 abstractC9223w53 = this.b;
        if (!abstractC9223w53.d(obj).equals(abstractC9223w53.d(obj2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.a(obj);
        this.d.a(obj2);
        throw null;
    }

    @Override // com.daaw.InterfaceC7821r53
    public final void f(Object obj, InterfaceC4454f53 interfaceC4454f53, U33 u33) {
        boolean zZzO;
        AbstractC9223w53 abstractC9223w53 = this.b;
        Object objC = abstractC9223w53.c(obj);
        V33 v33 = this.d;
        v33.b(obj);
        while (interfaceC4454f53.zzc() != Integer.MAX_VALUE) {
            try {
                int iZzd = interfaceC4454f53.zzd();
                if (iZzd != 11) {
                    if ((iZzd & 7) == 2) {
                        Object objC2 = v33.c(u33, this.a, iZzd >>> 3);
                        if (objC2 != null) {
                            v33.f(interfaceC4454f53, objC2, u33, null);
                        } else {
                            zZzO = abstractC9223w53.p(objC, interfaceC4454f53);
                        }
                    } else {
                        zZzO = interfaceC4454f53.zzO();
                    }
                    if (!zZzO) {
                        abstractC9223w53.n(obj, objC);
                        return;
                    }
                } else {
                    int iZzj = 0;
                    Object objC3 = null;
                    AbstractC9213w33 abstractC9213w33Zzp = null;
                    while (interfaceC4454f53.zzc() != Integer.MAX_VALUE) {
                        int iZzd2 = interfaceC4454f53.zzd();
                        if (iZzd2 == 16) {
                            iZzj = interfaceC4454f53.zzj();
                            objC3 = v33.c(u33, this.a, iZzj);
                        } else if (iZzd2 == 26) {
                            if (objC3 != null) {
                                v33.f(interfaceC4454f53, objC3, u33, null);
                            } else {
                                abstractC9213w33Zzp = interfaceC4454f53.zzp();
                            }
                        } else if (!interfaceC4454f53.zzO()) {
                            break;
                        }
                    }
                    if (interfaceC4454f53.zzd() != 12) {
                        throw C8939v43.b();
                    }
                    if (abstractC9213w33Zzp != null) {
                        if (objC3 != null) {
                            v33.g(abstractC9213w33Zzp, objC3, u33, null);
                        } else {
                            abstractC9223w53.k(objC, iZzj, abstractC9213w33Zzp);
                        }
                    }
                }
            } catch (Throwable th) {
                abstractC9223w53.n(obj, objC);
                throw th;
            }
        }
        abstractC9223w53.n(obj, objC);
    }

    @Override // com.daaw.InterfaceC7821r53
    public final void g(Object obj, Q33 q33) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.daaw.InterfaceC7821r53
    public final void h(Object obj, byte[] bArr, int i, int i2, C5291i33 c5291i33) {
        AbstractC4449f43 abstractC4449f43 = (AbstractC4449f43) obj;
        if (abstractC4449f43.zzc == C9502x53.c()) {
            abstractC4449f43.zzc = C9502x53.f();
        }
        AbstractC6314li0.a(obj);
        throw null;
    }

    @Override // com.daaw.InterfaceC7821r53
    public final int zza(Object obj) {
        AbstractC9223w53 abstractC9223w53 = this.b;
        int iB = abstractC9223w53.b(abstractC9223w53.d(obj));
        if (!this.c) {
            return iB;
        }
        this.d.a(obj);
        throw null;
    }

    @Override // com.daaw.InterfaceC7821r53
    public final Object zze() {
        U43 u43 = this.a;
        return u43 instanceof AbstractC4449f43 ? ((AbstractC4449f43) u43).m() : u43.e().F();
    }
}

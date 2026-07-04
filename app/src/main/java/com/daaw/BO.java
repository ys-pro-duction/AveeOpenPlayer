package com.daaw;

import com.daaw.AbstractC4512fJ0;
import com.daaw.C0611Db;
import com.daaw.CO;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BO {
    public static final C0576Cs0 b(List list, C3636c91 c3636c91, C0611Db c0611Db, InterfaceC2592Vu0 interfaceC2592Vu0, NQ nq) {
        Object objG;
        Object objA;
        Object objG2;
        int size = list.size();
        List listQ = null;
        for (int i = 0; i < size; i++) {
            InterfaceC6225lO interfaceC6225lO = (InterfaceC6225lO) list.get(i);
            int iA = interfaceC6225lO.a();
            CO.a aVar = CO.a;
            if (CO.e(iA, aVar.b())) {
                synchronized (c0611Db.d) {
                    try {
                        C0611Db.b bVar = new C0611Db.b(interfaceC6225lO, interfaceC2592Vu0.c());
                        C0611Db.a aVar2 = (C0611Db.a) c0611Db.b.d(bVar);
                        if (aVar2 == null) {
                            aVar2 = (C0611Db.a) c0611Db.c.b(bVar);
                        }
                        if (aVar2 != null) {
                            objG = aVar2.g();
                        } else {
                            G91 g91 = G91.a;
                            try {
                                Object objB = interfaceC2592Vu0.b(interfaceC6225lO);
                                C0611Db.f(c0611Db, interfaceC6225lO, interfaceC2592Vu0, objB, false, 8, null);
                                objG = objB;
                            } catch (Exception e) {
                                throw new IllegalStateException("Unable to load font " + interfaceC6225lO, e);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (objG != null) {
                    return D61.a(listQ, RO.a(c3636c91.e(), objG, interfaceC6225lO, c3636c91.f(), c3636c91.d()));
                }
                throw new IllegalStateException("Unable to load font " + interfaceC6225lO);
            }
            if (CO.e(iA, aVar.c())) {
                synchronized (c0611Db.d) {
                    try {
                        C0611Db.b bVar2 = new C0611Db.b(interfaceC6225lO, interfaceC2592Vu0.c());
                        C0611Db.a aVar3 = (C0611Db.a) c0611Db.b.d(bVar2);
                        if (aVar3 == null) {
                            aVar3 = (C0611Db.a) c0611Db.c.b(bVar2);
                        }
                        if (aVar3 != null) {
                            objG2 = aVar3.g();
                        } else {
                            G91 g912 = G91.a;
                            try {
                                AbstractC4512fJ0.a aVar4 = AbstractC4512fJ0.B;
                                objA = AbstractC4512fJ0.a(interfaceC2592Vu0.b(interfaceC6225lO));
                            } catch (Throwable th2) {
                                AbstractC4512fJ0.a aVar5 = AbstractC4512fJ0.B;
                                objA = AbstractC4512fJ0.a(AbstractC4801gJ0.a(th2));
                            }
                            Object obj = AbstractC4512fJ0.c(objA) ? null : objA;
                            C0611Db.f(c0611Db, interfaceC6225lO, interfaceC2592Vu0, obj, false, 8, null);
                            objG2 = obj;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (objG2 != null) {
                    return D61.a(listQ, RO.a(c3636c91.e(), objG2, interfaceC6225lO, c3636c91.f(), c3636c91.d()));
                }
            } else {
                if (!CO.e(iA, aVar.a())) {
                    throw new IllegalStateException("Unknown font type " + interfaceC6225lO);
                }
                C0611Db.a aVarD = c0611Db.d(interfaceC6225lO, interfaceC2592Vu0);
                if (aVarD != null) {
                    if (!C0611Db.a.e(aVarD.g()) && aVarD.g() != null) {
                        return D61.a(listQ, RO.a(c3636c91.e(), aVarD.g(), interfaceC6225lO, c3636c91.f(), c3636c91.d()));
                    }
                } else if (listQ == null) {
                    listQ = AbstractC1599Mm.q(interfaceC6225lO);
                } else {
                    listQ.add(interfaceC6225lO);
                }
            }
        }
        return D61.a(listQ, nq.invoke(c3636c91));
    }
}

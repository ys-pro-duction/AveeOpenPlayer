package com.daaw;

import com.daaw.SG;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LG {
    public static final LG b = new LG(new SG.a());
    public static final LG c = new LG(new SG.e());
    public static final LG d = new LG(new SG.g());
    public static final LG e = new LG(new SG.f());
    public static final LG f = new LG(new SG.b());
    public static final LG g = new LG(new SG.d());
    public static final LG h = new LG(new SG.c());
    public final e a;

    public static class b implements e {
        public final SG a;

        @Override // com.daaw.LG.e
        public Object a(String str) {
            Iterator it = LG.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.a.a(str, (Provider) it.next());
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    }
                }
            }
            return this.a.a(str, null);
        }

        public b(SG sg) {
            this.a = sg;
        }
    }

    public static class c implements e {
        public final SG a;

        @Override // com.daaw.LG.e
        public Object a(String str) {
            return this.a.a(str, null);
        }

        public c(SG sg) {
            this.a = sg;
        }
    }

    public static class d implements e {
        public final SG a;

        @Override // com.daaw.LG.e
        public Object a(String str) throws GeneralSecurityException {
            Iterator it = LG.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.a.a(str, (Provider) it.next());
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        public d(SG sg) {
            this.a = sg;
        }
    }

    public interface e {
        Object a(String str);
    }

    public LG(SG sg) {
        if (U31.c()) {
            this.a = new d(sg);
        } else if (AbstractC8501tZ0.a()) {
            this.a = new b(sg);
        } else {
            this.a = new c(sg);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        return this.a.a(str);
    }
}

package com.daaw;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8315ss {
    public final Set a = new HashSet();

    /* JADX INFO: renamed from: com.daaw.ss$a */
    public static final class a {
        public final Uri a;
        public final boolean b;

        public a(Uri uri, boolean z) {
            this.a = uri;
            this.b = z;
        }

        public Uri a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.b == aVar.b && this.a.equals(aVar.a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z) {
        this.a.add(new a(uri, z));
    }

    public Set b() {
        return this.a;
    }

    public int c() {
        return this.a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8315ss.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C8315ss) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

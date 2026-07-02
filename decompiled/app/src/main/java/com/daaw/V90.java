package com.daaw;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class V90 implements AV {
    public final Map c;
    public volatile Map d;

    public static final class a {
        public static final String e;
        public static final Map f;
        public boolean a = true;
        public Map b = f;
        public boolean c = true;
        public boolean d = true;

        static {
            String property = System.getProperty("http.agent");
            e = property;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put("User-Agent", Collections.singletonList(new b(property)));
            }
            map.put("Accept-Encoding", Collections.singletonList(new b("identity")));
            f = DesugarCollections.unmodifiableMap(map);
        }

        public V90 a() {
            this.a = true;
            return new V90(this.b);
        }
    }

    public static final class b implements U90 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // com.daaw.U90
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.a + "'}";
        }
    }

    public V90(Map map) {
        this.c = DesugarCollections.unmodifiableMap(map);
    }

    @Override // com.daaw.AV
    public Map a() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.d = DesugarCollections.unmodifiableMap(b());
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final Map b() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.c.entrySet()) {
            StringBuilder sb = new StringBuilder();
            List list = (List) entry.getValue();
            for (int i = 0; i < list.size(); i++) {
                sb.append(((U90) list.get(i)).a());
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
            map.put(entry.getKey(), sb.toString());
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof V90) {
            return this.c.equals(((V90) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.c + '}';
    }
}

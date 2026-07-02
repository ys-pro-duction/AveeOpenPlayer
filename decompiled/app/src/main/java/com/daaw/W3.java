package com.daaw;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface W3 {

    public interface a {
    }

    public interface b {
        void a(int i, Bundle bundle);
    }

    public static class c {
        public String a;
        public String b;
        public Object c;
        public String d;
        public long e;
        public String f;
        public Bundle g;
        public String h;
        public Bundle i;
        public long j;
        public String k;
        public Bundle l;
        public long m;
        public boolean n;
        public long o;
    }

    Map a(boolean z);

    a b(String str, b bVar);

    void c(String str, String str2, Bundle bundle);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    int d(String str);

    void e(c cVar);

    List f(String str, String str2);
}

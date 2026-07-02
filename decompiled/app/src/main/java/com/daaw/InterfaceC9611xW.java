package com.daaw;

import com.daaw.InterfaceC2595Vv;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.xW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9611xW extends InterfaceC2595Vv {

    /* JADX INFO: renamed from: com.daaw.xW$a */
    public static abstract class a implements b {
        public final e a = new e();

        @Override // com.daaw.InterfaceC2595Vv.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC9611xW a() {
            return c(this.a);
        }

        public abstract InterfaceC9611xW c(e eVar);
    }

    /* JADX INFO: renamed from: com.daaw.xW$b */
    public interface b extends InterfaceC2595Vv.a {
    }

    /* JADX INFO: renamed from: com.daaw.xW$d */
    public static final class d extends c {
        public final int D;
        public final Map E;

        public d(int i, Map map, C2907Yv c2907Yv) {
            super("Response code: " + i, c2907Yv, 1);
            this.D = i;
            this.E = map;
        }
    }

    /* JADX INFO: renamed from: com.daaw.xW$e */
    public static final class e {
        public final Map a = new HashMap();
        public Map b;

        public synchronized Map a() {
            try {
                if (this.b == null) {
                    this.b = DesugarCollections.unmodifiableMap(new HashMap(this.a));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.b;
        }
    }

    /* JADX INFO: renamed from: com.daaw.xW$c */
    public static class c extends IOException {
        public final int B;
        public final C2907Yv C;

        public c(String str, C2907Yv c2907Yv, int i) {
            super(str);
            this.C = c2907Yv;
            this.B = i;
        }

        public c(IOException iOException, C2907Yv c2907Yv, int i) {
            super(iOException);
            this.C = c2907Yv;
            this.B = i;
        }

        public c(String str, IOException iOException, C2907Yv c2907Yv, int i) {
            super(str, iOException);
            this.C = c2907Yv;
            this.B = i;
        }
    }
}

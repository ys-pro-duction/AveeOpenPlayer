package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.daaw.vd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9085vd0 implements InterfaceC10174zX0 {
    public static final String d = BY0.B0(C9085vd0.class.getCanonicalName(), ".", "");
    public static final InterfaceC10174zX0 e = new a("NO_LOCKS", f.a, C9268wG.b);
    public final MS0 a;
    public final f b;
    public final String c;

    /* JADX INFO: renamed from: com.daaw.vd0$a */
    public static class a extends C9085vd0 {
        public a(String str, f fVar, MS0 ms0) {
            super(str, fVar, ms0, null);
        }

        public static /* synthetic */ void j(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // com.daaw.C9085vd0
        public o p(String str, Object obj) {
            if (str == null) {
                j(0);
            }
            o oVarA = o.a();
            if (oVarA == null) {
                j(1);
            }
            return oVarA;
        }
    }

    /* JADX INFO: renamed from: com.daaw.vd0$b */
    public class b extends j {
        public final /* synthetic */ Object E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9085vd0 c9085vd0, LQ lq, Object obj) {
            super(c9085vd0, lq);
            this.E = obj;
        }

        private static /* synthetic */ void a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // com.daaw.C9085vd0.h
        public o d(boolean z) {
            o oVarD = o.d(this.E);
            if (oVarD == null) {
                a(0);
            }
            return oVarD;
        }
    }

    /* JADX INFO: renamed from: com.daaw.vd0$c */
    public class c extends k {
        public final /* synthetic */ NQ F;
        public final /* synthetic */ NQ G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C9085vd0 c9085vd0, LQ lq, NQ nq, NQ nq2) {
            super(c9085vd0, lq);
            this.F = nq;
            this.G = nq2;
        }

        private static /* synthetic */ void a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i != 2 ? 2 : 3];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // com.daaw.C9085vd0.h
        public o d(boolean z) {
            NQ nq = this.F;
            if (nq == null) {
                o oVarD = super.d(z);
                if (oVarD == null) {
                    a(0);
                }
                return oVarD;
            }
            o oVarD2 = o.d(nq.invoke(Boolean.valueOf(z)));
            if (oVarD2 == null) {
                a(1);
            }
            return oVarD2;
        }

        @Override // com.daaw.C9085vd0.i
        public void h(Object obj) {
            if (obj == null) {
                a(2);
            }
            this.G.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.daaw.vd0$d */
    public static class d extends e implements InterfaceC7986ri {
        public /* synthetic */ d(C9085vd0 c9085vd0, ConcurrentMap concurrentMap, a aVar) {
            this(c9085vd0, concurrentMap);
        }

        private static /* synthetic */ void c(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // com.daaw.C9085vd0.e, com.daaw.InterfaceC7986ri
        public Object a(Object obj, LQ lq) {
            if (lq == null) {
                c(2);
            }
            Object objA = super.a(obj, lq);
            if (objA == null) {
                c(3);
            }
            return objA;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C9085vd0 c9085vd0, ConcurrentMap concurrentMap) {
            super(c9085vd0, concurrentMap, null);
            if (c9085vd0 == null) {
                c(0);
            }
            if (concurrentMap == null) {
                c(1);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.vd0$e */
    public static class e extends l implements InterfaceC8265si {

        /* JADX INFO: renamed from: com.daaw.vd0$e$a */
        public class a implements NQ {
            @Override // com.daaw.NQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object invoke(g gVar) {
                return gVar.b.invoke();
            }
        }

        public /* synthetic */ e(C9085vd0 c9085vd0, ConcurrentMap concurrentMap, a aVar) {
            this(c9085vd0, concurrentMap);
        }

        private static /* synthetic */ void c(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public Object a(Object obj, LQ lq) {
            if (lq == null) {
                c(2);
            }
            return invoke(new g(obj, lq));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C9085vd0 c9085vd0, ConcurrentMap concurrentMap) {
            super(c9085vd0, concurrentMap, new a());
            if (c9085vd0 == null) {
                c(0);
            }
            if (concurrentMap == null) {
                c(1);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.vd0$f */
    public interface f {
        public static final f a = new a();

        /* JADX INFO: renamed from: com.daaw.vd0$f$a */
        public static class a implements f {
            public static /* synthetic */ void b(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // com.daaw.C9085vd0.f
            public RuntimeException a(Throwable th) {
                if (th == null) {
                    b(0);
                }
                throw AbstractC7038oI.b(th);
            }
        }

        RuntimeException a(Throwable th);
    }

    /* JADX INFO: renamed from: com.daaw.vd0$g */
    public static class g {
        public final Object a;
        public final LQ b;

        public g(Object obj, LQ lq) {
            this.a = obj;
            this.b = lq;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.a.equals(((g) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* JADX INFO: renamed from: com.daaw.vd0$i */
    public static abstract class i extends h {
        public volatile C9042vT0 E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C9085vd0 c9085vd0, LQ lq) {
            super(c9085vd0, lq);
            if (c9085vd0 == null) {
                a(0);
            }
            if (lq == null) {
                a(1);
            }
            this.E = null;
        }

        private static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // com.daaw.C9085vd0.h
        public final void c(Object obj) {
            this.E = new C9042vT0(obj);
            try {
                h(obj);
            } finally {
                this.E = null;
            }
        }

        public abstract void h(Object obj);

        @Override // com.daaw.C9085vd0.h, com.daaw.LQ
        public Object invoke() {
            C9042vT0 c9042vT0 = this.E;
            return (c9042vT0 == null || !c9042vT0.b()) ? super.invoke() : c9042vT0.a();
        }
    }

    /* JADX INFO: renamed from: com.daaw.vd0$j */
    public static class j extends h implements InterfaceC0881Fo0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C9085vd0 c9085vd0, LQ lq) {
            super(c9085vd0, lq);
            if (c9085vd0 == null) {
                a(0);
            }
            if (lq == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // com.daaw.C9085vd0.h, com.daaw.LQ
        public Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke == null) {
                a(2);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: renamed from: com.daaw.vd0$k */
    public static abstract class k extends i implements InterfaceC0881Fo0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C9085vd0 c9085vd0, LQ lq) {
            super(c9085vd0, lq);
            if (c9085vd0 == null) {
                a(0);
            }
            if (lq == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // com.daaw.C9085vd0.i, com.daaw.C9085vd0.h, com.daaw.LQ
        public Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke == null) {
                a(2);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: renamed from: com.daaw.vd0$l */
    public static class l implements InterfaceC5752jj0 {
        public final C9085vd0 B;
        public final ConcurrentMap C;
        public final NQ D;

        public l(C9085vd0 c9085vd0, ConcurrentMap concurrentMap, NQ nq) {
            if (c9085vd0 == null) {
                c(0);
            }
            if (concurrentMap == null) {
                c(1);
            }
            if (nq == null) {
                c(2);
            }
            this.B = c9085vd0;
            this.C = concurrentMap;
            this.D = nq;
        }

        private static /* synthetic */ void c(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // com.daaw.InterfaceC5752jj0
        public boolean I(Object obj) {
            Object obj2 = this.C.get(obj);
            return (obj2 == null || obj2 == n.COMPUTING) ? false : true;
        }

        public final AssertionError d(Object obj, Object obj2) {
            return (AssertionError) C9085vd0.q(new AssertionError("Inconsistent key detected. " + n.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.B));
        }

        public final AssertionError h(Object obj, Object obj2) {
            AssertionError assertionError = (AssertionError) C9085vd0.q(new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.B));
            if (assertionError == null) {
                c(4);
            }
            return assertionError;
        }

        public o i(Object obj, boolean z) {
            o oVarP = this.B.p("", obj);
            if (oVarP == null) {
                c(3);
            }
            return oVarP;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
  0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v21 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        @Override // com.daaw.NQ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 219
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9085vd0.l.invoke(java.lang.Object):java.lang.Object");
        }

        public final AssertionError j(Object obj, Throwable th) {
            return (AssertionError) C9085vd0.q(new AssertionError("Unable to remove " + obj + " under " + this.B, th));
        }
    }

    /* JADX INFO: renamed from: com.daaw.vd0$m */
    public static class m extends l implements InterfaceC5471ij0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C9085vd0 c9085vd0, ConcurrentMap concurrentMap, NQ nq) {
            super(c9085vd0, concurrentMap, nq);
            if (c9085vd0 == null) {
                c(0);
            }
            if (concurrentMap == null) {
                c(1);
            }
            if (nq == null) {
                c(2);
            }
        }

        private static /* synthetic */ void c(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 3 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // com.daaw.C9085vd0.l, com.daaw.NQ
        public Object invoke(Object obj) {
            Object objInvoke = super.invoke(obj);
            if (objInvoke == null) {
                c(3);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: renamed from: com.daaw.vd0$n */
    public enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* JADX INFO: renamed from: com.daaw.vd0$o */
    public static class o {
        public final Object a;
        public final boolean b;

        public o(Object obj, boolean z) {
            this.a = obj;
            this.b = z;
        }

        public static o a() {
            return new o(null, true);
        }

        public static o d(Object obj) {
            return new o(obj, false);
        }

        public Object b() {
            return this.a;
        }

        public boolean c() {
            return this.b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.a);
        }
    }

    public /* synthetic */ C9085vd0(String str, f fVar, MS0 ms0, a aVar) {
        this(str, fVar, ms0);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void j(int r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9085vd0.j(int):void");
    }

    public static ConcurrentMap m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static Throwable q(Throwable th) {
        if (th == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (!stackTrace[i2].getClassName().startsWith(d)) {
                break;
            }
            i2++;
        }
        List listSubList = Arrays.asList(stackTrace).subList(i2, length);
        th.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        return th;
    }

    @Override // com.daaw.InterfaceC10174zX0
    public InterfaceC4097dp0 a(LQ lq) {
        if (lq == null) {
            j(30);
        }
        return new h(this, lq);
    }

    @Override // com.daaw.InterfaceC10174zX0
    public InterfaceC5752jj0 b(NQ nq) {
        if (nq == null) {
            j(19);
        }
        InterfaceC5752jj0 interfaceC5752jj0O = o(nq, m());
        if (interfaceC5752jj0O == null) {
            j(20);
        }
        return interfaceC5752jj0O;
    }

    @Override // com.daaw.InterfaceC10174zX0
    public InterfaceC8265si c() {
        return new e(this, m(), null);
    }

    @Override // com.daaw.InterfaceC10174zX0
    public InterfaceC7986ri d() {
        return new d(this, m(), null);
    }

    @Override // com.daaw.InterfaceC10174zX0
    public InterfaceC0881Fo0 e(LQ lq, Object obj) {
        if (lq == null) {
            j(26);
        }
        if (obj == null) {
            j(27);
        }
        return new b(this, lq, obj);
    }

    @Override // com.daaw.InterfaceC10174zX0
    public Object f(LQ lq) {
        if (lq == null) {
            j(34);
        }
        this.a.b();
        try {
            return lq.invoke();
        } finally {
        }
    }

    @Override // com.daaw.InterfaceC10174zX0
    public InterfaceC5471ij0 g(NQ nq) {
        if (nq == null) {
            j(9);
        }
        InterfaceC5471ij0 interfaceC5471ij0N = n(nq, m());
        if (interfaceC5471ij0N == null) {
            j(10);
        }
        return interfaceC5471ij0N;
    }

    @Override // com.daaw.InterfaceC10174zX0
    public InterfaceC0881Fo0 h(LQ lq) {
        if (lq == null) {
            j(23);
        }
        return new j(this, lq);
    }

    @Override // com.daaw.InterfaceC10174zX0
    public InterfaceC0881Fo0 i(LQ lq, NQ nq, NQ nq2) {
        if (lq == null) {
            j(28);
        }
        if (nq2 == null) {
            j(29);
        }
        return new c(this, lq, nq, nq2);
    }

    public InterfaceC5471ij0 n(NQ nq, ConcurrentMap concurrentMap) {
        if (nq == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, nq);
    }

    public InterfaceC5752jj0 o(NQ nq, ConcurrentMap concurrentMap) {
        if (nq == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, nq);
    }

    public o p(String str, Object obj) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        throw ((AssertionError) q(new AssertionError(sb.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.c + ")";
    }

    public C9085vd0(String str, f fVar, MS0 ms0) {
        if (str == null) {
            j(4);
        }
        if (fVar == null) {
            j(5);
        }
        if (ms0 == null) {
            j(6);
        }
        this.a = ms0;
        this.b = fVar;
        this.c = str;
    }

    public C9085vd0(String str) {
        this(str, (Runnable) null, (NQ) null);
    }

    public C9085vd0(String str, Runnable runnable, NQ nq) {
        this(str, f.a, MS0.a.a(runnable, nq));
    }

    /* JADX INFO: renamed from: com.daaw.vd0$h */
    public static class h implements InterfaceC4097dp0 {
        public final C9085vd0 B;
        public final LQ C;
        public volatile Object D;

        public h(C9085vd0 c9085vd0, LQ lq) {
            if (c9085vd0 == null) {
                a(0);
            }
            if (lq == null) {
                a(1);
            }
            this.D = n.NOT_COMPUTED;
            this.B = c9085vd0;
            this.C = lq;
        }

        private static /* synthetic */ void a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public o d(boolean z) {
            o oVarP = this.B.p("in a lazy value", null);
            if (oVarP == null) {
                a(2);
            }
            return oVarP;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // com.daaw.LQ
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.D
                boolean r1 = r0 instanceof com.daaw.C9085vd0.n
                if (r1 != 0) goto Lb
                java.lang.Object r0 = com.daaw.AbstractC4636fj1.f(r0)
                return r0
            Lb:
                com.daaw.vd0 r0 = r4.B
                com.daaw.MS0 r0 = r0.a
                r0.b()
                java.lang.Object r0 = r4.D     // Catch: java.lang.Throwable -> L24
                boolean r1 = r0 instanceof com.daaw.C9085vd0.n     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L26
                java.lang.Object r0 = com.daaw.AbstractC4636fj1.f(r0)     // Catch: java.lang.Throwable -> L24
            L1c:
                com.daaw.vd0 r1 = r4.B
                com.daaw.MS0 r1 = r1.a
                r1.a()
                return r0
            L24:
                r0 = move-exception
                goto L85
            L26:
                com.daaw.vd0$n r1 = com.daaw.C9085vd0.n.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r0 != r1) goto L3e
                com.daaw.vd0$n r2 = com.daaw.C9085vd0.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                r4.D = r2     // Catch: java.lang.Throwable -> L24
                r2 = 1
                com.daaw.vd0$o r2 = r4.d(r2)     // Catch: java.lang.Throwable -> L24
                boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L24
                if (r3 != 0) goto L3e
                java.lang.Object r0 = r2.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L3e:
                com.daaw.vd0$n r2 = com.daaw.C9085vd0.n.RECURSION_WAS_DETECTED     // Catch: java.lang.Throwable -> L24
                if (r0 != r2) goto L52
                r0 = 0
                com.daaw.vd0$o r0 = r4.d(r0)     // Catch: java.lang.Throwable -> L24
                boolean r2 = r0.c()     // Catch: java.lang.Throwable -> L24
                if (r2 != 0) goto L52
                java.lang.Object r0 = r0.b()     // Catch: java.lang.Throwable -> L24
                goto L1c
            L52:
                r4.D = r1     // Catch: java.lang.Throwable -> L24
                com.daaw.LQ r0 = r4.C     // Catch: java.lang.Throwable -> L60
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L60
                r4.c(r0)     // Catch: java.lang.Throwable -> L60
                r4.D = r0     // Catch: java.lang.Throwable -> L60
                goto L1c
            L60:
                r0 = move-exception
                boolean r1 = com.daaw.AbstractC7038oI.a(r0)     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L7e
                java.lang.Object r1 = r4.D     // Catch: java.lang.Throwable -> L24
                com.daaw.vd0$n r2 = com.daaw.C9085vd0.n.COMPUTING     // Catch: java.lang.Throwable -> L24
                if (r1 != r2) goto L73
                java.lang.Object r1 = com.daaw.AbstractC4636fj1.c(r0)     // Catch: java.lang.Throwable -> L24
                r4.D = r1     // Catch: java.lang.Throwable -> L24
            L73:
                com.daaw.vd0 r1 = r4.B     // Catch: java.lang.Throwable -> L24
                com.daaw.vd0$f r1 = com.daaw.C9085vd0.k(r1)     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L7e:
                com.daaw.vd0$n r1 = com.daaw.C9085vd0.n.NOT_COMPUTED     // Catch: java.lang.Throwable -> L24
                r4.D = r1     // Catch: java.lang.Throwable -> L24
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L24
                throw r0     // Catch: java.lang.Throwable -> L24
            L85:
                com.daaw.vd0 r1 = r4.B
                com.daaw.MS0 r1 = r1.a
                r1.a()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9085vd0.h.invoke():java.lang.Object");
        }

        public boolean y() {
            return (this.D == n.NOT_COMPUTED || this.D == n.COMPUTING) ? false : true;
        }

        public void c(Object obj) {
        }
    }
}

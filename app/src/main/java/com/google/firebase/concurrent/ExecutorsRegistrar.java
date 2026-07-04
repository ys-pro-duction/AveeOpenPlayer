package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.daaw.C3535bo;
import com.daaw.C4205eC0;
import com.daaw.InterfaceC2516Vb0;
import com.daaw.InterfaceC2939Zd;
import com.daaw.InterfaceC3216ag;
import com.daaw.InterfaceC7569qB0;
import com.daaw.InterfaceC8295so;
import com.daaw.InterfaceC8397t91;
import com.daaw.InterfaceC9976yo;
import com.daaw.P90;
import com.daaw.ScheduledExecutorServiceC2503Uy;
import com.daaw.ThreadFactoryC6098kv;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final P90 a = new P90(new InterfaceC7569qB0() { // from class: com.daaw.HI
        @Override // com.daaw.InterfaceC7569qB0
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });
    public static final P90 b = new P90(new InterfaceC7569qB0() { // from class: com.daaw.II
        @Override // com.daaw.InterfaceC7569qB0
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });
    public static final P90 c = new P90(new InterfaceC7569qB0() { // from class: com.daaw.JI
        @Override // com.daaw.InterfaceC7569qB0
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });
    public static final P90 d = new P90(new InterfaceC7569qB0() { // from class: com.daaw.KI
        @Override // com.daaw.InterfaceC7569qB0
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
        }
    });

    public static /* synthetic */ ScheduledExecutorService a(InterfaceC8295so interfaceC8295so) {
        return (ScheduledExecutorService) b.get();
    }

    public static /* synthetic */ ScheduledExecutorService e(InterfaceC8295so interfaceC8295so) {
        return (ScheduledExecutorService) c.get();
    }

    public static /* synthetic */ ScheduledExecutorService g(InterfaceC8295so interfaceC8295so) {
        return (ScheduledExecutorService) a.get();
    }

    public static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            builderDetectNetwork.detectResourceMismatches();
            if (i >= 26) {
                builderDetectNetwork.detectUnbufferedIo();
            }
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    public static ThreadFactory j(String str, int i) {
        return new ThreadFactoryC6098kv(str, i, null);
    }

    public static ThreadFactory k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC6098kv(str, i, threadPolicy);
    }

    public static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new ScheduledExecutorServiceC2503Uy(executorService, (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C3535bo.d(C4205eC0.a(InterfaceC2939Zd.class, ScheduledExecutorService.class), C4205eC0.a(InterfaceC2939Zd.class, ExecutorService.class), C4205eC0.a(InterfaceC2939Zd.class, Executor.class)).f(new InterfaceC9976yo() { // from class: com.daaw.LI
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return ExecutorsRegistrar.g(interfaceC8295so);
            }
        }).d(), C3535bo.d(C4205eC0.a(InterfaceC3216ag.class, ScheduledExecutorService.class), C4205eC0.a(InterfaceC3216ag.class, ExecutorService.class), C4205eC0.a(InterfaceC3216ag.class, Executor.class)).f(new InterfaceC9976yo() { // from class: com.daaw.MI
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return ExecutorsRegistrar.e(interfaceC8295so);
            }
        }).d(), C3535bo.d(C4205eC0.a(InterfaceC2516Vb0.class, ScheduledExecutorService.class), C4205eC0.a(InterfaceC2516Vb0.class, ExecutorService.class), C4205eC0.a(InterfaceC2516Vb0.class, Executor.class)).f(new InterfaceC9976yo() { // from class: com.daaw.NI
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return ExecutorsRegistrar.a(interfaceC8295so);
            }
        }).d(), C3535bo.c(C4205eC0.a(InterfaceC8397t91.class, Executor.class)).f(new InterfaceC9976yo() { // from class: com.daaw.OI
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return EnumC8118s91.INSTANCE;
            }
        }).d());
    }
}

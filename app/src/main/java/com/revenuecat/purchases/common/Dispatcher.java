package com.revenuecat.purchases.common;

import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC6465mE0;
import com.daaw.AbstractC8417tE0;
import com.daaw.C6573me0;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.LE;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher;", "", "Ljava/util/concurrent/ExecutorService;", "executorService", "", "runningIntegrationTests", "<init>", "(Ljava/util/concurrent/ExecutorService;Z)V", "Ljava/lang/Runnable;", "command", "Lcom/revenuecat/purchases/common/Delay;", "delay", "Lcom/daaw/G91;", "enqueue", "(Ljava/lang/Runnable;Lcom/revenuecat/purchases/common/Delay;)V", "close", "()V", "isClosed", "()Z", "Ljava/util/concurrent/ExecutorService;", "Z", "Companion", "AsyncCall", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class Dispatcher {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final double INTEGRATION_TEST_DELAY_PERCENTAGE = 0.01d;
    private final ExecutorService executorService;
    private final boolean runningIntegrationTests;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "Ljava/lang/Runnable;", "<init>", "()V", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "call", "()Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "result", "onCompletion", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)V", "run", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class AsyncCall implements Runnable {
        public abstract HTTPResult call();

        public void onCompletion(HTTPResult result) {
            G10.g(result, "result");
        }

        public void onError(PurchasesError error) {
            G10.g(error, "error");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                onCompletion(call());
            } catch (SignatureVerificationException e) {
                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e);
                LogUtilsKt.errorLog(purchasesError);
                onError(purchasesError);
            } catch (IOException e2) {
                PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e2);
                LogUtilsKt.errorLog(purchasesError2);
                onError(purchasesError2);
            } catch (SecurityException e3) {
                PurchasesError purchasesError3 = ErrorsKt.toPurchasesError(e3);
                LogUtilsKt.errorLog(purchasesError3);
                onError(purchasesError3);
            } catch (JSONException e4) {
                PurchasesError purchasesError4 = ErrorsKt.toPurchasesError(e4);
                LogUtilsKt.errorLog(purchasesError4);
                onError(purchasesError4);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher$Companion;", "", "()V", "INTEGRATION_TEST_DELAY_PERCENTAGE", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        private Companion() {
        }
    }

    public Dispatcher(ExecutorService executorService, boolean z) {
        G10.g(executorService, "executorService");
        this.executorService = executorService;
        this.runningIntegrationTests = z;
    }

    public static /* synthetic */ void enqueue$default(Dispatcher dispatcher, Runnable runnable, Delay delay, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i & 2) != 0) {
            delay = Delay.NONE;
        }
        dispatcher.enqueue(runnable, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$2$lambda$1(Future future) throws Throwable {
        try {
            future.get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
        }
    }

    public void close() {
        synchronized (this.executorService) {
            this.executorService.shutdownNow();
        }
    }

    public void enqueue(Runnable command, Delay delay) {
        final Future<?> futureSubmit;
        G10.g(command, "command");
        G10.g(delay, "delay");
        synchronized (this.executorService) {
            try {
                if (!this.executorService.isShutdown()) {
                    if (delay == Delay.NONE || !(this.executorService instanceof ScheduledExecutorService)) {
                        futureSubmit = this.executorService.submit(command);
                    } else {
                        long jO = AbstractC8417tE0.o(new C6573me0(LE.s(delay.getMinDelay()), LE.s(delay.getMaxDelay())), AbstractC6465mE0.B);
                        if (this.runningIntegrationTests) {
                            jO = (long) (jO * 0.01d);
                        }
                        futureSubmit = ((ScheduledExecutorService) this.executorService).schedule(command, jO, TimeUnit.MILLISECONDS);
                    }
                    new Thread(new Runnable() { // from class: com.daaw.qC
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            Dispatcher.enqueue$lambda$2$lambda$1(futureSubmit);
                        }
                    }).start();
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isClosed() {
        boolean zIsShutdown;
        synchronized (this.executorService) {
            zIsShutdown = this.executorService.isShutdown();
        }
        return zIsShutdown;
    }

    public /* synthetic */ Dispatcher(ExecutorService executorService, boolean z, int i, AbstractC2911Yw abstractC2911Yw) {
        this(executorService, (i & 2) != 0 ? false : z);
    }
}

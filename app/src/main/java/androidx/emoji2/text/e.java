package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.c;
import com.daaw.AbstractC3266aq;
import com.daaw.AbstractC8621ty0;
import com.daaw.LO;
import com.daaw.S41;
import com.daaw.TO;
import com.daaw.X81;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class e extends c.AbstractC0013c {
    public static final a k = new a();

    public static class a {
        public Typeface a(Context context, TO.b bVar) {
            return TO.a(context, null, new TO.b[]{bVar});
        }

        public TO.a b(Context context, LO lo) {
            return TO.b(context, null, lo);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public static class b implements c.h {
        public final Context a;
        public final LO b;
        public final a c;
        public final Object d = new Object();
        public Handler e;
        public Executor f;
        public ThreadPoolExecutor g;
        public c.i h;
        public ContentObserver i;
        public Runnable j;

        public b(Context context, LO lo, a aVar) {
            AbstractC8621ty0.h(context, "Context cannot be null");
            AbstractC8621ty0.h(lo, "FontRequest cannot be null");
            this.a = context.getApplicationContext();
            this.b = lo;
            this.c = aVar;
        }

        @Override // androidx.emoji2.text.c.h
        public void a(c.i iVar) {
            AbstractC8621ty0.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.d) {
                this.h = iVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    ContentObserver contentObserver = this.i;
                    if (contentObserver != null) {
                        this.c.c(this.a, contentObserver);
                        this.i = null;
                    }
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(this.j);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void c() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    try {
                        TO.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            S41.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.c.a(this.a, bVarE);
                            ByteBuffer byteBufferF = X81.f(this.a, null, bVarE.d());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            f fVarB = f.b(typefaceA, byteBufferF);
                            S41.b();
                            synchronized (this.d) {
                                try {
                                    c.i iVar = this.h;
                                    if (iVar != null) {
                                        iVar.b(fVarB);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            S41.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.d) {
                            try {
                                c.i iVar2 = this.h;
                                if (iVar2 != null) {
                                    iVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void d() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = AbstractC3266aq.b("emojiCompat");
                        this.g = threadPoolExecutorB;
                        this.f = threadPoolExecutorB;
                    }
                    this.f.execute(new Runnable() { // from class: com.daaw.MO
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.B.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final TO.b e() {
            try {
                TO.a aVarB = this.c.b(this.a, this.b);
                if (aVarB.c() == 0) {
                    TO.b[] bVarArrB = aVarB.b();
                    if (bVarArrB == null || bVarArrB.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrB[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        public void f(Executor executor) {
            synchronized (this.d) {
                this.f = executor;
            }
        }
    }

    public e(Context context, LO lo) {
        super(new b(context, lo, k));
    }

    public e c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}

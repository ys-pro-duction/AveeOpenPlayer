package com.daaw.avee.comp.playback;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.SurfaceHolder;
import com.daaw.C7978rg1;
import com.daaw.C8257sg1;
import com.daaw.C8815ug1;
import com.daaw.C9101vg1;
import com.daaw.C9659xg1;
import com.daaw.avee.comp.playback.a;
import com.daaw.avee.comp.playback.b;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static List a = new LinkedList();
    public static C7978rg1 b = new C7978rg1().b(new k(), a);
    public static C7978rg1 c = new C7978rg1().b(new q(), a);
    public static C9659xg1 d = new C9659xg1().b(new r(), a);
    public static C8815ug1 e = new C8815ug1().b(new s(), a);
    public static C8257sg1 f = new C8257sg1().b(new t(), a);
    public static C7978rg1 g = new C7978rg1().b(new u(), a);
    public static C8257sg1 h = new C8257sg1().b(new v(), a);
    public static C8257sg1 i = new C8257sg1().b(new w(), a);
    public static C8257sg1 j = new C8257sg1().b(new x(), a);
    public static C8257sg1 k = new C8257sg1().b(new a(), a);
    public static C8257sg1 l = new C8257sg1().b(new b(), a);
    public static C8257sg1 m = new C8257sg1().b(new C0154c(), a);
    public static C8257sg1 n = new C8257sg1().b(new d(), a);
    public static C9101vg1 o = new C9101vg1().b(new e(), a);
    public static C9101vg1 p = new C9101vg1().b(new f(), a);
    public static C8257sg1 q = new C8257sg1().b(new g(), a);
    public static C7978rg1 r = new C7978rg1().b(new h(), a);
    public static C8257sg1 s = new C8257sg1().b(new i(), a);
    public static C8257sg1 t = new C8257sg1().b(new j(), a);
    public static C7978rg1 u = new C7978rg1().b(new l(), a);
    public static C8257sg1 v = new C8257sg1().b(new m(), a);
    public static C7978rg1 w = new C7978rg1().b(new n(), a);
    public static C9101vg1 x = new C9101vg1().b(new o(), a);
    public static C8257sg1 y = new C8257sg1().b(new p(), a);

    public class a implements C8257sg1.a {
        @Override // com.daaw.C8257sg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num) {
            c.d("VIDEO_SCALING_MODE_ACTION", num.intValue());
        }
    }

    public class b implements C8257sg1.a {
        @Override // com.daaw.C8257sg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(SurfaceHolder surfaceHolder) {
            MediaPlaybackService mediaPlaybackServiceD = MediaPlaybackService.D();
            if (mediaPlaybackServiceD != null) {
                mediaPlaybackServiceD.H0(surfaceHolder);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.avee.comp.playback.c$c, reason: collision with other inner class name */
    public class C0154c implements C8257sg1.a {
        @Override // com.daaw.C8257sg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Float f) {
            c.c("VOLUME_PERCENTAGE_ACTION", f.floatValue());
        }
    }

    public class d implements C8257sg1.a {
        @Override // com.daaw.C8257sg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num) {
            c.d("VOLUME_ACTION", num.intValue());
        }
    }

    public class e implements C9101vg1.a {
        @Override // com.daaw.C9101vg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float invoke() {
            MediaPlaybackService mediaPlaybackServiceD = MediaPlaybackService.D();
            return mediaPlaybackServiceD != null ? Float.valueOf(mediaPlaybackServiceD.L()) : Float.valueOf(0.0f);
        }
    }

    public class f implements C9101vg1.a {
        @Override // com.daaw.C9101vg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke() {
            MediaPlaybackService mediaPlaybackServiceD = MediaPlaybackService.D();
            if (mediaPlaybackServiceD != null) {
                return Integer.valueOf(mediaPlaybackServiceD.J());
            }
            return 0;
        }
    }

    public class g implements C8257sg1.a {
        @Override // com.daaw.C8257sg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Boolean bool) {
            c.f("SET_MUTE_ACTION", bool.booleanValue());
        }
    }

    public class h implements C7978rg1.a {
        @Override // com.daaw.C7978rg1.a
        public void invoke() {
            c.b("TOGGLE_MUTE_ACTION");
        }
    }

    public class i implements C8257sg1.a {
        @Override // com.daaw.C8257sg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Float f) {
            c.c("VOLUME_STEREO_BALANCE_ACTION", f.floatValue());
        }
    }

    public class j implements C8257sg1.a {
        @Override // com.daaw.C8257sg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Float f) {
            c.c("CROSS_FADE_VALUE_ACTION", f.floatValue());
        }
    }

    public class k implements C7978rg1.a {
        @Override // com.daaw.C7978rg1.a
        public void invoke() {
            MediaPlaybackService mediaPlaybackServiceD = MediaPlaybackService.D();
            if (mediaPlaybackServiceD != null) {
                mediaPlaybackServiceD.s0();
            }
        }
    }

    public class l implements C7978rg1.a {
        @Override // com.daaw.C7978rg1.a
        public void invoke() {
            MediaPlaybackService mediaPlaybackServiceD = MediaPlaybackService.D();
            if (mediaPlaybackServiceD != null) {
                mediaPlaybackServiceD.q0();
            }
        }
    }

    public class m implements C8257sg1.a {
        @Override // com.daaw.C8257sg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num) {
            MediaPlaybackService mediaPlaybackServiceD = MediaPlaybackService.D();
            if (mediaPlaybackServiceD != null) {
                mediaPlaybackServiceD.w0(num.intValue());
            }
        }
    }

    public class n implements C7978rg1.a {
        @Override // com.daaw.C7978rg1.a
        public void invoke() {
            MediaPlaybackService mediaPlaybackServiceD = MediaPlaybackService.D();
            if (mediaPlaybackServiceD != null) {
                mediaPlaybackServiceD.o0();
            }
        }
    }

    public class o implements C9101vg1.a {
        @Override // com.daaw.C9101vg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b.C0153b invoke() {
            MediaPlaybackService mediaPlaybackServiceD = MediaPlaybackService.D();
            if (mediaPlaybackServiceD != null) {
                return mediaPlaybackServiceD.C();
            }
            return null;
        }
    }

    public class p implements C8257sg1.a {
        @Override // com.daaw.C8257sg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(b.c cVar) {
            MediaPlaybackService mediaPlaybackServiceD = MediaPlaybackService.D();
            if (mediaPlaybackServiceD != null) {
                mediaPlaybackServiceD.z0(cVar);
            }
        }
    }

    public class q implements C7978rg1.a {
        @Override // com.daaw.C7978rg1.a
        public void invoke() {
            c.b("EXIT_ACTION");
        }
    }

    public class r implements C9659xg1.a {
        @Override // com.daaw.C9659xg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.daaw.avee.comp.playback.a invoke(com.daaw.avee.comp.playback.a aVar, a.g gVar) {
            MediaPlaybackService mediaPlaybackServiceD = MediaPlaybackService.D();
            if (mediaPlaybackServiceD != null) {
                return mediaPlaybackServiceD.I(aVar, gVar);
            }
            return null;
        }
    }

    public class s implements C8815ug1.a {
        @Override // com.daaw.C8815ug1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(String str, Boolean bool, Long l, Long l2) {
            Intent intent = new Intent("PLAY_DATA_SOURCE_ACTION");
            intent.putExtra("EXTRA_ARG_1", str);
            intent.putExtra("EXTRA_ARG_2", bool);
            intent.putExtra("EXTRA_ARG_3", l);
            intent.putExtra("EXTRA_ARG_4", l2 == null ? 0L : l2.longValue());
            c.a(intent);
        }
    }

    public class t implements C8257sg1.a {
        @Override // com.daaw.C8257sg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num) {
            int iIntValue = num.intValue();
            if (iIntValue == 1) {
                c.b("PLAY_ACTION");
                return;
            }
            if (iIntValue == 2) {
                c.b("PAUSE_ACTION");
            } else if (iIntValue == 3) {
                c.b("STOP_ACTION");
            } else {
                if (iIntValue != 4) {
                    return;
                }
                c.b("TOGGLE_PAUSE_ACTION");
            }
        }
    }

    public class u implements C7978rg1.a {
        @Override // com.daaw.C7978rg1.a
        public void invoke() {
        }
    }

    public class v implements C8257sg1.a {
        @Override // com.daaw.C8257sg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Boolean bool) {
            MediaPlaybackService mediaPlaybackServiceD = MediaPlaybackService.D();
            if (!bool.booleanValue()) {
                c.b("TIMEOUT_DISABLE_ACTION");
            } else if (mediaPlaybackServiceD != null) {
                mediaPlaybackServiceD.E0(true);
            }
        }
    }

    public class w implements C8257sg1.a {
        @Override // com.daaw.C8257sg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Long l) {
            c.e("SEEK_ACTION", l.longValue());
        }
    }

    public class x implements C8257sg1.a {
        @Override // com.daaw.C8257sg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num) {
            c.d("REPEAT_MODE_ACTION", num.intValue());
        }
    }

    public static void a(Intent intent) {
        Context contextK = com.daaw.avee.a.k();
        if (contextK == null) {
            return;
        }
        intent.setComponent(new ComponentName(contextK, (Class<?>) MediaPlaybackService.class));
        g(contextK, intent);
    }

    public static void b(String str) {
        Context contextK = com.daaw.avee.a.k();
        if (contextK == null) {
            return;
        }
        ComponentName componentName = new ComponentName(contextK, (Class<?>) MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.setComponent(componentName);
        g(contextK, intent);
    }

    public static void c(String str, float f2) {
        Context contextK = com.daaw.avee.a.k();
        if (contextK == null) {
            return;
        }
        ComponentName componentName = new ComponentName(contextK, (Class<?>) MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.putExtra("EXTRA_ARG_1", f2);
        intent.setComponent(componentName);
        g(contextK, intent);
    }

    public static void d(String str, int i2) {
        Context contextK = com.daaw.avee.a.k();
        if (contextK == null) {
            return;
        }
        ComponentName componentName = new ComponentName(contextK, (Class<?>) MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.putExtra("EXTRA_ARG_1", i2);
        intent.setComponent(componentName);
        g(contextK, intent);
    }

    public static void e(String str, long j2) {
        Context contextK = com.daaw.avee.a.k();
        if (contextK == null) {
            return;
        }
        ComponentName componentName = new ComponentName(contextK, (Class<?>) MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.putExtra("EXTRA_ARG_1", j2);
        intent.setComponent(componentName);
        g(contextK, intent);
    }

    public static void f(String str, boolean z) {
        Context contextK = com.daaw.avee.a.k();
        if (contextK == null) {
            return;
        }
        ComponentName componentName = new ComponentName(contextK, (Class<?>) MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.putExtra("EXTRA_ARG_1", z);
        intent.setComponent(componentName);
        g(contextK, intent);
    }

    public static void g(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }
}

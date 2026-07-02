package com.google.android.gms.ads.internal.util;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.daaw.AbstractC2555Vl;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC7360pS2;
import com.daaw.AbstractC7582qE1;
import com.daaw.AbstractC8673u83;
import com.daaw.AbstractC9164vt;
import com.daaw.AbstractC9820yE1;
import com.daaw.C10140zO2;
import com.daaw.C3786ci2;
import com.daaw.C3996dT1;
import com.daaw.C4218eF1;
import com.daaw.C4498fF2;
import com.daaw.C4972gv;
import com.daaw.C5622jF2;
import com.daaw.C6049km3;
import com.daaw.C6878nj1;
import com.daaw.C9392wi3;
import com.daaw.ET;
import com.daaw.HB;
import com.daaw.HandlerC8451tM2;
import com.daaw.InterfaceC5133hW1;
import com.daaw.InterfaceFutureC8236sc0;
import com.daaw.KF1;
import com.daaw.LR0;
import com.daaw.Mo3;
import com.daaw.TN2;
import com.daaw.TP1;
import com.daaw.VW1;
import com.daaw.WS1;
import com.daaw.XS1;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.revenuecat.purchases.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.conscrypt.PSKKeyManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzt {
    public static final HandlerC8451tM2 zza = new zzf(Looper.getMainLooper());
    public String g;
    public final AtomicReference a = new AtomicReference(null);
    public final AtomicReference b = new AtomicReference(null);
    public final AtomicReference c = new AtomicReference(new Bundle());
    public final AtomicBoolean d = new AtomicBoolean();
    public boolean e = true;
    public final Object f = new Object();
    public boolean h = false;
    public boolean i = false;
    public final Executor j = Executors.newSingleThreadExecutor();

    public static KeyguardManager a(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    public static Bundle b(Context context) {
        try {
            return C6878nj1.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    public static String c(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    public static boolean d(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static final void e(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final String h() {
        StringBuilder sb = new StringBuilder(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final int[] i() {
        return new int[]{0, 0};
    }

    public static final boolean zzA(Context context) {
        try {
            return HB.b(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzB(String str) {
        if (!C3996dT1.k()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.O4)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.Q4);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.P4);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzC(Context context) {
        KeyguardManager keyguardManagerA;
        return (context == null || (keyguardManagerA = a(context)) == null || !keyguardManagerA.isKeyguardLocked()) ? false : true;
    }

    public static final boolean zzD(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            AbstractC4274eT1.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzo().u(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzE() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean zzF(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzG(Context context) {
        Bundle bundleB = b(context);
        return TextUtils.isEmpty(c(bundleB)) && !TextUtils.isEmpty(bundleB.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean zzH(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzI(View view, int i, MotionEvent motionEvent) {
        String strA;
        int i2;
        int iHeight;
        int iWidth;
        char c;
        char c2;
        String str;
        C4498fF2 c4498fF2B;
        C5622jF2 c5622jF2ZzP;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = childAt.getContext().getPackageName();
            if (childAt instanceof C3786ci2) {
                childAt = ((C3786ci2) childAt).getChildAt(0);
            }
            if ((childAt instanceof com.google.android.gms.ads.formats.zzg) || (childAt instanceof NativeAdView)) {
                strA = "NATIVE";
                i2 = 1;
            } else {
                strA = "UNKNOWN";
                i2 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            long jZzv = zzv(childAt);
            childAt.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof VW1) || (c5622jF2ZzP = ((VW1) childAt).zzP()) == null) {
                c = 1;
                c2 = 0;
                str = "none";
            } else {
                str = c5622jF2ZzP.b;
                int iHashCode = childAt.hashCode();
                c = 1;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                c2 = 0;
                sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                sb.append(iHashCode);
                childAt.setContentDescription(sb.toString());
            }
            if ((childAt instanceof InterfaceC5133hW1) && (c4498fF2B = ((InterfaceC5133hW1) childAt).b()) != null) {
                strA = C4498fF2.a(c4498fF2B.b);
                i2 = c4498fF2B.f;
                str2 = c4498fF2B.G;
            }
            Locale locale = Locale.US;
            Integer numValueOf = Integer.valueOf(childAt.hashCode());
            Integer numValueOf2 = Integer.valueOf(i2);
            String name = childAt.getClass().getName();
            Integer numValueOf3 = Integer.valueOf(i3);
            Integer numValueOf4 = Integer.valueOf(i4);
            Integer numValueOf5 = Integer.valueOf(childAt.getWidth());
            Integer numValueOf6 = Integer.valueOf(childAt.getHeight());
            Integer numValueOf7 = Integer.valueOf(iWidth);
            Integer numValueOf8 = Integer.valueOf(iHeight);
            Long lValueOf = Long.valueOf(jZzv);
            String string = Integer.toString(i, 2);
            Object[] objArr = new Object[15];
            objArr[c2] = numValueOf;
            objArr[c] = packageName;
            objArr[2] = str2;
            objArr[3] = str;
            objArr[4] = strA;
            objArr[5] = numValueOf2;
            objArr[6] = name;
            objArr[7] = numValueOf3;
            objArr[8] = numValueOf4;
            objArr[9] = numValueOf5;
            objArr[10] = numValueOf6;
            objArr[11] = numValueOf7;
            objArr[12] = numValueOf8;
            objArr[13] = lValueOf;
            objArr[14] = string;
            AbstractC4274eT1.zzi(String.format(locale, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", objArr));
        } catch (Exception e) {
            AbstractC4274eT1.zzh("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder zzJ(Context context) {
        return new AlertDialog.Builder(context, com.google.android.gms.ads.internal.zzt.zzq().zza());
    }

    public static final void zzK(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new zzca(context, str, (String) it.next()).zzb();
        }
    }

    public static final void zzL(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) KF1.b.e()).booleanValue()) {
                    AbstractC9164vt.a(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final String zzM(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int i = inputStreamReader.read(cArr);
            if (i == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i);
        }
    }

    public static final int zzN(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            AbstractC4274eT1.zzj("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    public static final Map zzO(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    public static final int[] zzP(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? i() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] zzQ(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArrI = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? i() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zzb().f(activity, iArrI[0]), com.google.android.gms.ads.internal.client.zzay.zzb().f(activity, iArrI[1])};
    }

    public static final boolean zzR(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzt.zzp().e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzn(view);
        long jZzv = zzv(view);
        if (view.getVisibility() != 0 || !view.isShown() || ((powerManager != null && !powerManager.isScreenOn()) || !z)) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.j1)).booleanValue() && !view.getLocalVisibleRect(new Rect()) && !view.getGlobalVisibleRect(new Rect())) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.L9)).booleanValue()) {
            if (jZzv < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.N9)).intValue()) {
                return false;
            }
        }
        return true;
    }

    public static final void zzS(Context context, Intent intent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.da)).booleanValue()) {
            e(context, intent);
            return;
        }
        try {
            e(context, intent);
        } catch (SecurityException e) {
            AbstractC4274eT1.zzk("", e);
            com.google.android.gms.ads.internal.zzt.zzo().u(e, "AdUtil.startActivityWithUnknownContext");
        }
    }

    public static final void zzT(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzo(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            AbstractC4274eT1.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            AbstractC4274eT1.zzh("No browser is found.", e);
        }
    }

    public static final int[] zzU(Activity activity) {
        int[] iArrZzP = zzP(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzay.zzb().f(activity, iArrZzP[0]), com.google.android.gms.ads.internal.client.zzay.zzb().f(activity, iArrZzP[1])};
    }

    public static final boolean zzV(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzR(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, a(context));
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        AbstractC4274eT1.zzj("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    public static List zzd() {
        AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.a;
        List listB = com.google.android.gms.ads.internal.client.zzba.zza().b();
        ArrayList arrayList = new ArrayList();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            Iterator it2 = C10140zO2.c(TN2.b(',')).d((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzn(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L9
        L7:
            r2 = r0
            goto L13
        L9:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L7
            android.app.Activity r2 = (android.app.Activity) r2
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzt.zzn(android.view.View):boolean");
    }

    public static final void zzo(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String zzp(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return c(b(context));
    }

    public static final String zzr() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final DisplayMetrics zzs(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static final Map zzu(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzo().u(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzv(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public static final WebResourceResponse zzw(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbq(context).zzb(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            AbstractC4274eT1.zzk("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final String zzx() {
        Resources resourcesD = com.google.android.gms.ads.internal.zzt.zzo().d();
        return resourcesD != null ? resourcesD.getString(com.google.android.gms.ads.impl.R.string.s7) : "Test Ad";
    }

    public static final zzbt zzy(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                AbstractC4274eT1.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof zzbt ? (zzbt) iInterfaceQueryLocalInterface : new zzbr(iBinder);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().u(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzz(Context context, String str) {
        Context contextA = TP1.a(context);
        return C6878nj1.a(contextA).b(str, contextA.getPackageName()) == 0;
    }

    public final /* synthetic */ void g(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.c.set(zzad.zzb(context, str));
    }

    public final InterfaceFutureC8236sc0 zzb(final Uri uri) {
        return AbstractC7360pS2.j(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HandlerC8451tM2 handlerC8451tM2 = zzt.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                return zzt.zzO(uri);
            }
        }, this.j);
    }

    public final String zzc(final Context context, String str) {
        String str2;
        synchronized (this.f) {
            try {
                String str3 = this.g;
                if (str3 != null) {
                    return str3;
                }
                if (str == null) {
                    return h();
                }
                try {
                    zzck zzckVarZza = zzck.zza();
                    if (TextUtils.isEmpty(zzckVarZza.a)) {
                        if (AbstractC2555Vl.a()) {
                            str2 = (String) zzch.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzci
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    Context context2 = context;
                                    SharedPreferences sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                    String string = sharedPreferences.getString("user_agent", "");
                                    if (!TextUtils.isEmpty(string)) {
                                        zze.zza("User agent is already initialized on Google Play Services.");
                                        return string;
                                    }
                                    zze.zza("User agent is not initialized on Google Play Services. Initializing.");
                                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context2);
                                    LR0.a(context2, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
                                    return defaultUserAgent;
                                }
                            });
                        } else {
                            final Context contextD = ET.d(context);
                            str2 = (String) zzch.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcj
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    SharedPreferences sharedPreferences;
                                    Context context2 = contextD;
                                    Context context3 = context;
                                    boolean z = false;
                                    if (context2 != null) {
                                        zze.zza("Attempting to read user agent from Google Play Services.");
                                        sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                                    } else {
                                        zze.zza("Attempting to read user agent from local cache.");
                                        sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                        z = true;
                                    }
                                    String string = sharedPreferences.getString("user_agent", "");
                                    if (!TextUtils.isEmpty(string)) {
                                        return string;
                                    }
                                    zze.zza("Reading user agent from WebSettings");
                                    String defaultUserAgent = WebSettings.getDefaultUserAgent(context3);
                                    if (z) {
                                        sharedPreferences.edit().putString("user_agent", defaultUserAgent).apply();
                                        zze.zza("Persisting user agent.");
                                    }
                                    return defaultUserAgent;
                                }
                            });
                        }
                        zzckVarZza.a = str2;
                    }
                    this.g = zzckVarZza.a;
                } catch (Exception unused) {
                }
                if (TextUtils.isEmpty(this.g)) {
                    this.g = WebSettings.getDefaultUserAgent(context);
                }
                if (TextUtils.isEmpty(this.g)) {
                    this.g = h();
                }
                this.g = this.g + " (Mobile; " + str;
                try {
                    if (C6878nj1.a(context).g()) {
                        this.g = this.g + ";aia";
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzt.zzo().u(e, "AdUtil.getUserAgent");
                }
                String str4 = this.g + ")";
                this.g = str4;
                return str4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int iZza = zza(i);
        AbstractC4274eT1.zzi("HTTP timeout: " + iZza + " milliseconds.");
        httpURLConnection.setConnectTimeout(iZza);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iZza);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void zzh(final Context context, final String str, String str2, Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.zzt.zzp();
        bundle.putString("device", zzr());
        AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.a;
        bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().a()));
        if (bundle.isEmpty()) {
            AbstractC4274eT1.zze("Empty or null bundle.");
        } else {
            final String str3 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.I9);
            if (!this.d.getAndSet(true)) {
                this.c.set(zzad.zza(context, str3, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.ads.internal.util.zzm
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str4) {
                        this.zza.g(context, str3, sharedPreferences, str4);
                    }
                }));
            }
            bundle.putAll((Bundle) this.c.get());
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        XS1.A(context, str, "gmob-apps", bundle, true, new WS1() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // com.daaw.WS1
            public final boolean zza(String str4) {
                HandlerC8451tM2 handlerC8451tM2 = zzt.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                zzt.zzK(context, str, str4);
                return true;
            }
        });
    }

    public final boolean zzi(String str) {
        return d(str, this.a, (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.b0));
    }

    public final boolean zzj(String str) {
        return d(str, this.b, (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.c0));
    }

    public final boolean zzk(Context context) {
        if (this.i) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        AbstractC9820yE1.a(context);
        zzp zzpVar = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.ca)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new C6049km3(this, zzpVar), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new C6049km3(this, zzpVar), intentFilter, 4);
        }
        this.i = true;
        return true;
    }

    public final boolean zzl(Context context) {
        if (this.h) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        AbstractC9820yE1.a(context);
        zzr zzrVar = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.ca)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new Mo3(this, zzrVar), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new Mo3(this, zzrVar), intentFilter, 4);
        }
        this.h = true;
        return true;
    }

    public final int zzm(Context context, Uri uri) {
        int i;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i = 0;
        } else {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        }
        AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.t4;
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(abstractC7582qE1);
        AbstractC7582qE1 abstractC7582qE12 = AbstractC9820yE1.u4;
        if (true == bool.equals(com.google.android.gms.ads.internal.client.zzba.zzc().b(abstractC7582qE12))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(abstractC7582qE1)).booleanValue()) {
            C4218eF1 c4218eF1 = new C4218eF1();
            c4218eF1.e(new C9392wi3(this, c4218eF1, context, uri));
            c4218eF1.b((Activity) context);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(abstractC7582qE12)).booleanValue()) {
            return 5;
        }
        C4972gv c4972gvA = new C4972gv.b().a();
        c4972gvA.a.setPackage(AbstractC8673u83.a(context));
        c4972gvA.a(context, uri);
        return 5;
    }
}

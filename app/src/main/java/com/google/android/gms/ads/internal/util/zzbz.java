package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC9820yE1;
import com.daaw.C10140zO2;
import com.daaw.C4498fF2;
import com.daaw.TN2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzbz {
    public static JSONObject a(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().f(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().f(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().f(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().f(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int b(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }

    public static Point zza(MotionEvent motionEvent, View view) {
        int[] iArrZzj = zzj(view);
        return new Point(((int) motionEvent.getRawX()) - iArrZzj[0], ((int) motionEvent.getRawY()) - iArrZzj[1]);
    }

    public static WindowManager.LayoutParams zzb() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.O7)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject zzc(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().f(context, point2.x));
                    jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().f(context, point2.y));
                    jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzay.zzb().f(context, point.x));
                    jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzay.zzb().f(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    AbstractC4274eT1.zzh("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                AbstractC4274eT1.zzh("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static JSONObject zzd(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        Iterator it;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] iArrZzj = zzj(view);
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArrZzj2 = zzj(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    int[] iArr = iArrZzj;
                    try {
                        it = it2;
                        try {
                            jSONObject4.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().f(context, view2.getMeasuredWidth()));
                            jSONObject4.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().f(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().f(context, iArrZzj2[0] - iArr[0]));
                            jSONObject4.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().f(context, iArrZzj2[1] - iArr[1]));
                            jSONObject4.put(str4, str3);
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = a(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().f(context, iArrZzj2[0] - iArr[0]));
                                jSONObject.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().f(context, iArrZzj2[1] - iArr[1]));
                                jSONObject.put(str4, str3);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.I7)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.J7)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", b(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", b(layoutParams.height) - 1);
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.K7)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.L7)).booleanValue() && scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject3.put("font_size", textView.getTextSize());
                                    jSONObject3.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    AbstractC4274eT1.zzj("Unable to get asset views information");
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (JSONException unused3) {
                        str = str3;
                        str2 = str4;
                        it = it2;
                    }
                    it2 = it;
                    iArrZzj = iArr;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    public static JSONObject zze(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                com.google.android.gms.ads.internal.zzt.zzp();
                jSONObject.put("can_show_on_lock_screen", zzt.zzn(view));
                com.google.android.gms.ads.internal.zzt.zzp();
                jSONObject.put("is_keyguard_locked", zzt.zzC(context));
                return jSONObject;
            } catch (JSONException unused) {
                AbstractC4274eT1.zzj("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject zzf(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.H7)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzp();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                    return jSONObject;
                }
                com.google.android.gms.ads.internal.zzt.zzp();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                    z = false;
                }
                jSONObject.put("contained_in_scroll_view", z);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0174 A[Catch: JSONException -> 0x016d, TRY_LEAVE, TryCatch #6 {JSONException -> 0x016d, blocks: (B:33:0x013e, B:50:0x0169, B:53:0x016f, B:54:0x0174), top: B:70:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0179 -> B:69:0x017e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject zzg(android.content.Context r17, android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbz.zzg(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean zzh(Context context, C4498fF2 c4498fF2) {
        if (!c4498fF2.P) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.M7)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.P7)).booleanValue();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.N7);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = C10140zO2.c(TN2.b(';')).d(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean zzi(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.k3)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.l3)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    public static int[] zzj(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }
}

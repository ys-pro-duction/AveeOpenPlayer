package com.daaw.avee;

import android.animation.ValueAnimator;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import com.daaw.AbstractC0405Bb1;
import com.daaw.AbstractC0441Bk1;
import com.daaw.AbstractC1765Ob1;
import com.daaw.AbstractC1815Oo;
import com.daaw.AbstractC2884Yp0;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC3192ab0;
import com.daaw.AbstractC3374bD0;
import com.daaw.AbstractC3703cQ;
import com.daaw.AbstractC4192e90;
import com.daaw.AbstractC4507fI;
import com.daaw.AbstractC4776gD;
import com.daaw.AbstractC5056hD0;
import com.daaw.AbstractC5075hI;
import com.daaw.AbstractC5339iE0;
import com.daaw.AbstractC5624jG0;
import com.daaw.AbstractC6348lp;
import com.daaw.AbstractC6608ml0;
import com.daaw.AbstractC6687n2;
import com.daaw.AbstractC7329pL;
import com.daaw.AbstractC9046vU0;
import com.daaw.AbstractC9204w2;
import com.daaw.AbstractC9438ws;
import com.daaw.AbstractC9536xD0;
import com.daaw.AbstractC9815yD0;
import com.daaw.B61;
import com.daaw.C0321Ag1;
import com.daaw.C0529Cg1;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;
import com.daaw.C10217zg1;
import com.daaw.C1058Hg1;
import com.daaw.C2078Qw0;
import com.daaw.C2359To;
import com.daaw.C3083aA0;
import com.daaw.C4268eS;
import com.daaw.C6015kg;
import com.daaw.C7050oL;
import com.daaw.C7110oa;
import com.daaw.C8217sY;
import com.daaw.C9453wv0;
import com.daaw.C9938yg1;
import com.daaw.ED0;
import com.daaw.EnumC7395pb0;
import com.daaw.FP;
import com.daaw.G10;
import com.daaw.G3;
import com.daaw.G91;
import com.daaw.GP;
import com.daaw.HP;
import com.daaw.IC0;
import com.daaw.IL;
import com.daaw.IT0;
import com.daaw.InterfaceC3429bR;
import com.daaw.InterfaceC4484fC0;
import com.daaw.InterfaceC5559j2;
import com.daaw.InterfaceC5781jp;
import com.daaw.InterfaceC6408m2;
import com.daaw.InterfaceC7381pY;
import com.daaw.InterfaceC8007rm0;
import com.daaw.InterfaceC9894yX;
import com.daaw.JD0;
import com.daaw.L01;
import com.daaw.LQ;
import com.daaw.M01;
import com.daaw.MR0;
import com.daaw.O90;
import com.daaw.OY0;
import com.daaw.P8;
import com.daaw.PC0;
import com.daaw.Q01;
import com.daaw.R01;
import com.daaw.SharedPreferencesOnSharedPreferenceChangeListenerC5706ja;
import com.daaw.T5;
import com.daaw.WB0;
import com.daaw.X61;
import com.daaw.avee.Common.ListPreferenceLanguage;
import com.daaw.avee.CustomViewPager;
import com.daaw.avee.MainActivity;
import com.daaw.avee.composables.ComposableActivity;
import com.google.android.material.navigation.NavigationView;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.lang.ref.WeakReference;
import java.security.Security;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 Þ\u00012\u00020\u00012\u00020\u0002:\u0003ß\u0001HB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0014¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0005H\u0014¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u0005H\u0014¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u0005H\u0014¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010\u0004J\u001f\u0010.\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010/J\u001f\u00101\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b1\u0010/J\u0017\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0005¢\u0006\u0004\b6\u0010\u0004J\u0017\u00109\u001a\u00020\u000b2\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\u0005¢\u0006\u0004\b;\u0010\u0004J\r\u0010<\u001a\u00020\u0005¢\u0006\u0004\b<\u0010\u0004J\u0017\u0010=\u001a\u00020\u000b2\u0006\u00108\u001a\u000207H\u0017¢\u0006\u0004\b=\u0010:J\u000f\u0010>\u001a\u00020\u0005H\u0016¢\u0006\u0004\b>\u0010\u0004J\r\u0010?\u001a\u00020\u0005¢\u0006\u0004\b?\u0010\u0004J\u0017\u0010B\u001a\u00020\u00052\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\u0005¢\u0006\u0004\bF\u0010\u0004J\r\u0010G\u001a\u00020\u0005¢\u0006\u0004\bG\u0010\u0004J\u001d\u0010J\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\bL\u0010EJ\u001d\u0010M\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\bM\u0010NJ\u0015\u0010Q\u001a\u00020\u00052\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\u001d\u0010U\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\u000b¢\u0006\u0004\bU\u0010KJ\u001d\u0010V\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\u000b¢\u0006\u0004\bV\u0010KJ\u001d\u0010W\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\u000b¢\u0006\u0004\bW\u0010KJ\u0015\u0010Y\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u000b¢\u0006\u0004\bY\u0010\u0015J-\u0010`\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\u000e2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0[2\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b`\u0010aJ)\u0010d\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\u000e2\u0006\u0010b\u001a\u00020\u000e2\b\u0010c\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001b\u0010p\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010h\u001a\u0004\bn\u0010oR$\u0010x\u001a\u0004\u0018\u00010q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR+\u0010~\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010\r\"\u0004\b}\u0010\u0015R.\u0010\u0082\u0001\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0014\n\u0004\b\u007f\u0010{\u001a\u0005\b\u0080\u0001\u0010\r\"\u0005\b\u0081\u0001\u0010\u0015R/\u0010\u0086\u0001\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010{\u001a\u0005\b\u0084\u0001\u0010\r\"\u0005\b\u0085\u0001\u0010\u0015R/\u0010\u008a\u0001\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010{\u001a\u0005\b\u0088\u0001\u0010\r\"\u0005\b\u0089\u0001\u0010\u0015R\u0019\u0010\u008d\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u0091\u0001\u001a\u00070\u008e\u0001R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R2\u0010\u009d\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001070\u0096\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0019\u0010 \u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001c\u0010¤\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001c\u0010¨\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001c\u0010¬\u0001\u001a\u0005\u0018\u00010©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001c\u0010°\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R+\u0010¶\u0001\u001a\u00030±\u00012\u0007\u0010y\u001a\u00030±\u00018\u0006@BX\u0086.¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R\u001c\u0010º\u0001\u001a\u0005\u0018\u00010·\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001c\u0010¼\u0001\u001a\u0005\u0018\u00010·\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¹\u0001R\u0019\u0010¾\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010\u009f\u0001R\u0019\u0010À\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010\u009f\u0001R\u001b\u0010Ã\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u001b\u0010Å\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Â\u0001R\u001b\u0010Ç\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Â\u0001R\u001b\u0010É\u0001\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010Â\u0001R\u001a\u0010Í\u0001\u001a\u00030Ê\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u001f\u0010Ò\u0001\u001a\n\u0012\u0005\u0012\u00030Ï\u00010Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u001b\u0010Õ\u0001\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R,\u0010Ý\u0001\u001a\u0005\u0018\u00010Ö\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b×\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001¨\u0006à\u0001"}, d2 = {"Lcom/daaw/avee/MainActivity;", "Lcom/daaw/P8;", "Lcom/daaw/w2$c;", "<init>", "()V", "Lcom/daaw/G91;", "E1", "Landroid/widget/SearchView;", "searchView", "x1", "(Landroid/widget/SearchView;)V", "", "X0", "()Z", "", "position", "Landroid/app/Fragment;", "a1", "(I)Landroid/app/Fragment;", "show", "P1", "(Z)V", "pagePosition", "eventFromSystemUiHider", "D1", "(ZIZ)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onStop", "onPause", "onResume", "onDestroy", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyLongPress", "(ILandroid/view/KeyEvent;)Z", "onKeyUp", "onKeyDown", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "J1", "Landroid/view/MenuItem;", "item", "s1", "(Landroid/view/MenuItem;)Z", "u1", "F1", "onOptionsItemSelected", "onUserInteraction", "K1", "Lcom/daaw/yX;", "currentSearchEntry", "L1", "(Lcom/daaw/yX;)V", "t1", "(I)V", "Y0", "Z0", "b", "dim", "w1", "(ZZ)V", "G1", "C1", "(ZI)V", "Lcom/daaw/Qw0$b;", "songData", "H1", "(Lcom/daaw/Qw0$b;)V", "state", "evenFromOnCreateOptionsMenu", "N1", "M1", "I1", "resetTimer", "v1", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/daaw/MR0;", "e0", "Lcom/daaw/O90;", "g1", "()Lcom/daaw/MR0;", "sharedPrefs", "Lcom/daaw/WB0;", "f0", "f1", "()Lcom/daaw/WB0;", "purchaseService", "Lcom/daaw/avee/a;", "g0", "Lcom/daaw/avee/a;", "getPlayerCore", "()Lcom/daaw/avee/a;", "setPlayerCore", "(Lcom/daaw/avee/a;)V", "playerCore", "<set-?>", "h0", "Lcom/daaw/rm0;", "h1", "y1", "show30DiscountDialog", "i0", "i1", "z1", "show70DiscountDialog", "j0", "j1", "A1", "showDonationDialog", "k0", "k1", "B1", "showMoreTemplatesDialog", "l0", "I", "currentFragmentPage", "Lcom/daaw/avee/MainActivity$b;", "m0", "Lcom/daaw/avee/MainActivity$b;", "sectionsPagerAdapter", "Lcom/daaw/avee/CustomViewPager;", "n0", "Lcom/daaw/avee/CustomViewPager;", "viewPager", "Ljava/lang/ref/WeakReference;", "o0", "Ljava/lang/ref/WeakReference;", "getPremiumMenuWeak", "()Ljava/lang/ref/WeakReference;", "setPremiumMenuWeak", "(Ljava/lang/ref/WeakReference;)V", "premiumMenuWeak", "p0", "Z", "slowClosingInProgress", "Landroid/widget/Toast;", "q0", "Landroid/widget/Toast;", "slowClosingToast", "Ljava/util/Timer;", "r0", "Ljava/util/Timer;", "slowClosingTimer", "Lcom/daaw/L01;", "s0", "Lcom/daaw/L01;", "systemUiHider", "Landroidx/drawerlayout/widget/DrawerLayout;", "t0", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Landroidx/appcompat/widget/Toolbar;", "u0", "Landroidx/appcompat/widget/Toolbar;", "l1", "()Landroidx/appcompat/widget/Toolbar;", "toolBar", "Landroidx/appcompat/widget/SwitchCompat;", "v0", "Landroidx/appcompat/widget/SwitchCompat;", "switchSleepTimer", "w0", "switchLockOrient", "x0", "updatingSleepTimerSwitch", "y0", "updatingLockOrientSwitch", "z0", "Landroid/view/MenuItem;", "searchMenuItem", "A0", "vizBtn0MenuItem", "B0", "vizBtn1MenuItem", "C0", "vizBtn2MenuItem", "Landroid/os/Handler;", "D0", "Landroid/os/Handler;", "handler", "", "", "E0", "Ljava/util/List;", "listenerReferenceHolder", "F0", "Lcom/daaw/Qw0$b;", "assignedSongData", "Landroid/animation/ValueAnimator;", "G0", "Landroid/animation/ValueAnimator;", "getVizMenuButtonAnimator", "()Landroid/animation/ValueAnimator;", "setVizMenuButtonAnimator", "(Landroid/animation/ValueAnimator;)V", "vizMenuButtonAnimator", "H0", "a", "app_standardRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MainActivity extends P8 implements AbstractC9204w2.c {

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int I0 = 8;
    public static C10217zg1 J0 = new C10217zg1();
    public static C10217zg1 K0 = new C10217zg1();
    public static C10217zg1 L0 = new C10217zg1();
    public static C10217zg1 M0 = new C10217zg1();
    public static C10217zg1 N0 = new C10217zg1();
    public static C10217zg1 O0 = new C10217zg1();
    public static C9938yg1 P0 = new C9938yg1();
    public static C9938yg1 Q0 = new C9938yg1();
    public static C0321Ag1 R0 = new C0321Ag1();
    public static C10217zg1 S0 = new C10217zg1();
    public static C10217zg1 T0 = new C10217zg1();
    public static C0529Cg1 U0 = new C0529Cg1();
    public static C0746Eg1 V0 = new C0746Eg1();
    public static C0746Eg1 W0 = new C0746Eg1();
    public static C0321Ag1 X0 = new C0321Ag1();
    public static C10217zg1 Y0 = new C10217zg1();
    public static C10217zg1 Z0 = new C10217zg1();
    public static C0746Eg1 a1 = new C0746Eg1();
    public static C0321Ag1 b1 = new C0321Ag1();
    public static C10217zg1 c1 = new C10217zg1();
    public static C10217zg1 d1 = new C10217zg1();
    public static C0321Ag1 e1 = new C0321Ag1();
    public static C0321Ag1 f1 = new C0321Ag1();
    public static C1058Hg1 g1 = new C1058Hg1();
    public static C0321Ag1 h1 = new C0321Ag1();
    public static C0746Eg1 i1 = new C0746Eg1();
    public static C0746Eg1 j1 = new C0746Eg1();
    public static C0746Eg1 k1 = new C0746Eg1();
    public static C0850Fg1 l1 = new C0850Fg1();
    public static C0850Fg1 m1 = new C0850Fg1();
    public static C0850Fg1 n1 = new C0850Fg1();
    public static MainActivity o1;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    public MenuItem vizBtn0MenuItem;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public MenuItem vizBtn1MenuItem;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public MenuItem vizBtn2MenuItem;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    public Handler handler;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public final List listenerReferenceHolder;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    public C2078Qw0.b assignedSongData;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    public ValueAnimator vizMenuButtonAnimator;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public final O90 sharedPrefs;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public final O90 purchaseService;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public a playerCore;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public final InterfaceC8007rm0 show30DiscountDialog;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public final InterfaceC8007rm0 show70DiscountDialog;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public final InterfaceC8007rm0 showDonationDialog;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public final InterfaceC8007rm0 showMoreTemplatesDialog;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public int currentFragmentPage;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public b sectionsPagerAdapter;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public CustomViewPager viewPager;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public WeakReference premiumMenuWeak;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public boolean slowClosingInProgress;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public Toast slowClosingToast;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    public Timer slowClosingTimer;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    public L01 systemUiHider;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public DrawerLayout drawerLayout;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    public Toolbar toolBar;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public SwitchCompat switchSleepTimer;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    public SwitchCompat switchLockOrient;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public boolean updatingSleepTimerSwitch;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    public boolean updatingLockOrientSwitch;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public MenuItem searchMenuItem;

    /* JADX INFO: renamed from: com.daaw.avee.MainActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final FP b() {
            MainActivity mainActivityE = e();
            if (mainActivityE == null) {
                return null;
            }
            return (FP) mainActivityE.a1(0);
        }

        public final GP c() {
            MainActivity mainActivityE = e();
            if (mainActivityE == null) {
                return null;
            }
            return (GP) mainActivityE.a1(1);
        }

        public final HP d() {
            MainActivity mainActivityE = e();
            if (mainActivityE == null) {
                return null;
            }
            return (HP) mainActivityE.a1(2);
        }

        public final MainActivity e() {
            return MainActivity.o1;
        }

        public final C0850Fg1 f() {
            return MainActivity.l1;
        }

        public final void g(MenuItem menuItem, Integer num) {
            Drawable icon;
            if (num == null || menuItem == null || (icon = menuItem.getIcon()) == null) {
                return;
            }
            icon.setAlpha(num.intValue());
        }

        public Companion() {
        }
    }

    public final class b extends AbstractC3703cQ {
        public b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // com.daaw.AbstractC7480ps0
        public int c() {
            return 3;
        }

        @Override // com.daaw.AbstractC7480ps0
        public CharSequence e(int i) {
            Drawable drawableE;
            SpannableStringBuilder spannableStringBuilder;
            if (i == 0) {
                drawableE = AbstractC9438ws.e(MainActivity.this, AbstractC3374bD0.I);
                spannableStringBuilder = new SpannableStringBuilder("   ");
            } else if (i == 1) {
                drawableE = AbstractC9438ws.e(MainActivity.this, AbstractC3374bD0.P);
                spannableStringBuilder = new SpannableStringBuilder("   ");
            } else {
                if (i != 2) {
                    return " ";
                }
                drawableE = AbstractC9438ws.e(MainActivity.this, AbstractC3374bD0.d0);
                spannableStringBuilder = new SpannableStringBuilder("   ");
            }
            if (drawableE == null) {
                return "";
            }
            drawableE.setBounds(0, 0, drawableE.getIntrinsicWidth(), drawableE.getIntrinsicHeight());
            spannableStringBuilder.setSpan(new ImageSpan(drawableE, 1), 1, 2, 33);
            return spannableStringBuilder;
        }

        @Override // com.daaw.AbstractC3703cQ
        public Fragment p(int i) {
            if (i == 0) {
                return FP.x();
            }
            if (i == 1) {
                return GP.o();
            }
            if (i != 2) {
                return null;
            }
            return HP.i();
        }
    }

    public static final class c implements CustomViewPager.a {
        public c() {
        }

        @Override // com.daaw.avee.CustomViewPager.a
        public void a(float f) {
            MainActivity.e1.a(Float.valueOf(f), MainActivity.this.getApplicationContext());
        }

        @Override // com.daaw.avee.CustomViewPager.a
        public void b() {
            MainActivity.d1.a(MainActivity.this.getApplicationContext());
        }

        @Override // com.daaw.avee.CustomViewPager.a
        public void c() {
        }
    }

    public static final class d implements ViewPager.i {
        public d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void b(int i) {
            if (i == 1) {
                X61.h.u(true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int i) {
            MainActivity.this.t1(i);
        }
    }

    public static final class e extends AbstractC4192e90 implements InterfaceC3429bR {

        public static final class a extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ MainActivity B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MainActivity mainActivity) {
                super(0);
                this.B = mainActivity;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m43invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m43invoke() {
                this.B.y1(false);
            }
        }

        public static final class b extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ MainActivity B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MainActivity mainActivity) {
                super(0);
                this.B = mainActivity;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m44invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m44invoke() {
                this.B.z1(false);
            }
        }

        public static final class c extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ MainActivity B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(MainActivity mainActivity) {
                super(0);
                this.B = mainActivity;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m45invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m45invoke() {
                this.B.A1(false);
            }
        }

        public static final class d extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ MainActivity B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(MainActivity mainActivity) {
                super(0);
                this.B = mainActivity;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m46invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m46invoke() {
                this.B.B1(false);
            }
        }

        public e() {
            super(2);
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(535897238, i, -1, "com.daaw.avee.MainActivity.onCreate.<anonymous> (MainActivity.kt:355)");
            }
            interfaceC5781jp.e(1619959800);
            if (MainActivity.this.h1()) {
                OY0.a(new a(MainActivity.this), interfaceC5781jp, 0);
            }
            interfaceC5781jp.L();
            interfaceC5781jp.e(1619959926);
            if (MainActivity.this.i1()) {
                OY0.d(new b(MainActivity.this), interfaceC5781jp, 0);
            }
            interfaceC5781jp.L();
            interfaceC5781jp.e(1619960056);
            if (MainActivity.this.j1()) {
                AbstractC4776gD.a(new c(MainActivity.this), interfaceC5781jp, 0);
            }
            interfaceC5781jp.L();
            if (MainActivity.this.k1()) {
                AbstractC6608ml0.a(new d(MainActivity.this), interfaceC5781jp, 0);
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class f extends AbstractC2884Yp0 {
        public f() {
            super(true);
        }

        @Override // com.daaw.AbstractC2884Yp0
        public void d() {
            Companion companion = MainActivity.INSTANCE;
            C0850Fg1 c0850Fg1F = companion.f();
            MainActivity mainActivity = MainActivity.this;
            Boolean bool = Boolean.FALSE;
            Object objA = c0850Fg1F.a(mainActivity, bool);
            G10.f(objA, "invoke(...)");
            if (((Boolean) objA).booleanValue()) {
                return;
            }
            Object objA2 = X61.h.e().a(bool);
            G10.f(objA2, "invoke(...)");
            if (((Boolean) objA2).booleanValue()) {
                return;
            }
            if (MainActivity.this.drawerLayout != null) {
                DrawerLayout drawerLayout = MainActivity.this.drawerLayout;
                G10.d(drawerLayout);
                if (drawerLayout.A(8388611)) {
                    DrawerLayout drawerLayout2 = MainActivity.this.drawerLayout;
                    G10.d(drawerLayout2);
                    drawerLayout2.f();
                    return;
                }
            }
            if (MainActivity.this.viewPager != null) {
                CustomViewPager customViewPager = MainActivity.this.viewPager;
                G10.d(customViewPager);
                if (customViewPager.getCurrentItem() != 0) {
                    CustomViewPager customViewPager2 = MainActivity.this.viewPager;
                    G10.d(customViewPager2);
                    customViewPager2.setCurrentItem(0);
                    return;
                }
            }
            FP fpB = companion.b();
            if (fpB == null || !fpB.l()) {
                MainActivity.this.finish();
            } else {
                fpB.r();
            }
        }
    }

    public static final class g implements SearchView.OnQueryTextListener {
        public final /* synthetic */ SearchView a;

        public g(SearchView searchView) {
            this.a = searchView;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            G10.g(str, "newText");
            if (this.a.getTag() == null) {
                return true;
            }
            Object tag = this.a.getTag();
            G10.e(tag, "null cannot be cast to non-null type kotlin.Int");
            Integer num = (Integer) tag;
            num.intValue();
            MainActivity.X0.a(num, str);
            return true;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            G10.g(str, "query");
            this.a.clearFocus();
            if (this.a.getTag() == null) {
                return true;
            }
            Object tag = this.a.getTag();
            G10.e(tag, "null cannot be cast to non-null type kotlin.Int");
            Integer num = (Integer) tag;
            num.intValue();
            MainActivity.X0.a(num, str);
            return true;
        }
    }

    public static final class h extends TimerTask {
        public h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            MainActivity.this.slowClosingInProgress = false;
            Toast toast = MainActivity.this.slowClosingToast;
            if (toast != null) {
                toast.cancel();
            }
            if (MainActivity.this.slowClosingTimer != null) {
                Timer timer = MainActivity.this.slowClosingTimer;
                G10.d(timer);
                timer.cancel();
            }
            MainActivity.this.Y0();
        }
    }

    public static final class i implements LQ {
        public final /* synthetic */ ComponentCallbacks B;
        public final /* synthetic */ InterfaceC4484fC0 C;
        public final /* synthetic */ LQ D;

        public i(ComponentCallbacks componentCallbacks, InterfaceC4484fC0 interfaceC4484fC0, LQ lq) {
            this.B = componentCallbacks;
            this.C = interfaceC4484fC0;
            this.D = lq;
        }

        @Override // com.daaw.LQ
        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.B;
            return T5.a(componentCallbacks).c(AbstractC5624jG0.b(MR0.class), this.C, this.D);
        }
    }

    public static final class j implements LQ {
        public final /* synthetic */ ComponentCallbacks B;
        public final /* synthetic */ InterfaceC4484fC0 C;
        public final /* synthetic */ LQ D;

        public j(ComponentCallbacks componentCallbacks, InterfaceC4484fC0 interfaceC4484fC0, LQ lq) {
            this.B = componentCallbacks;
            this.C = interfaceC4484fC0;
            this.D = lq;
        }

        @Override // com.daaw.LQ
        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.B;
            return T5.a(componentCallbacks).c(AbstractC5624jG0.b(WB0.class), this.C, this.D);
        }
    }

    public static final class k implements InterfaceC7381pY {
        public Object a;

        @Override // com.daaw.InterfaceC7381pY
        public void a(Object obj) {
            this.a = obj;
        }

        @Override // com.daaw.InterfaceC7381pY
        public void b(C8217sY c8217sY, String str, String str2) {
            AbstractC1765Ob1.h(C8217sY.g(c8217sY));
            C8217sY.c(c8217sY);
        }
    }

    public MainActivity() {
        EnumC7395pb0 enumC7395pb0 = EnumC7395pb0.B;
        this.sharedPrefs = AbstractC3192ab0.b(enumC7395pb0, new i(this, null, null));
        this.purchaseService = AbstractC3192ab0.b(enumC7395pb0, new j(this, null, null));
        Boolean bool = Boolean.FALSE;
        this.show30DiscountDialog = AbstractC9046vU0.d(bool, null, 2, null);
        this.show70DiscountDialog = AbstractC9046vU0.d(bool, null, 2, null);
        this.showDonationDialog = AbstractC9046vU0.d(bool, null, 2, null);
        this.showMoreTemplatesDialog = AbstractC9046vU0.d(bool, null, 2, null);
        this.currentFragmentPage = -1;
        this.premiumMenuWeak = new WeakReference(null);
        LinkedList linkedList = new LinkedList();
        this.listenerReferenceHolder = linkedList;
        this.assignedSongData = C2078Qw0.h;
        AbstractC5075hI.a.b(new C10217zg1.a() { // from class: com.daaw.Sf0
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                MainActivity.N0(this.a, (String) obj);
            }
        }, linkedList);
        this.handler = new Handler(new Handler.Callback() { // from class: com.daaw.Tf0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return MainActivity.O0(this.B, message);
            }
        });
    }

    public static void H0(MainActivity mainActivity, String str) {
        G10.g(mainActivity, "this$0");
        if (mainActivity.isFinishing()) {
            return;
        }
        C6015kg.d(mainActivity, str, 1).e();
    }

    public static final void N0(final MainActivity mainActivity, final String str) {
        G10.g(mainActivity, "this$0");
        if (!AbstractC1765Ob1.d()) {
            mainActivity.runOnUiThread(new Runnable() { // from class: com.daaw.Of0
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.H0(this.B, str);
                }
            });
        } else {
            if (mainActivity.isFinishing()) {
                return;
            }
            C6015kg.d(mainActivity, str, 1).e();
        }
    }

    public static final boolean O0(MainActivity mainActivity, Message message) {
        G10.g(mainActivity, "this$0");
        G10.g(message, "msg");
        int i2 = message.what;
        if (i2 != 2) {
            Handler handler = null;
            if (i2 == 3) {
                AbstractC4507fI.b.a();
                Handler handler2 = mainActivity.handler;
                if (handler2 == null) {
                    G10.u("handler");
                    handler2 = null;
                }
                handler2.removeMessages(3);
                Handler handler3 = mainActivity.handler;
                if (handler3 == null) {
                    G10.u("handler");
                    handler3 = null;
                }
                Message messageObtainMessage = handler3.obtainMessage(3);
                G10.f(messageObtainMessage, "obtainMessage(...)");
                Handler handler4 = mainActivity.handler;
                if (handler4 == null) {
                    G10.u("handler");
                } else {
                    handler = handler4;
                }
                handler.sendMessageDelayed(messageObtainMessage, 10000L);
            } else if (i2 == 4) {
                AbstractC4507fI.a.a();
                Handler handler5 = mainActivity.handler;
                if (handler5 == null) {
                    G10.u("handler");
                    handler5 = null;
                }
                handler5.removeMessages(4);
                Handler handler6 = mainActivity.handler;
                if (handler6 == null) {
                    G10.u("handler");
                    handler6 = null;
                }
                Message messageObtainMessage2 = handler6.obtainMessage(4);
                G10.f(messageObtainMessage2, "obtainMessage(...)");
                Handler handler7 = mainActivity.handler;
                if (handler7 == null) {
                    G10.u("handler");
                } else {
                    handler = handler7;
                }
                handler.sendMessageDelayed(messageObtainMessage2, 1000L);
            }
        } else if (mainActivity.currentFragmentPage == 2 && SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.n)) {
            mainActivity.C1(false, mainActivity.currentFragmentPage);
        }
        return false;
    }

    public static final void O1(MainActivity mainActivity, boolean z, boolean z2) {
        G10.g(mainActivity, "this$0");
        mainActivity.M1(z, z2);
    }

    public static final void Q1(MainActivity mainActivity, Integer num) {
        G10.g(mainActivity, "this$0");
        Companion companion = INSTANCE;
        companion.g(mainActivity.vizBtn0MenuItem, num);
        companion.g(mainActivity.vizBtn1MenuItem, num);
        companion.g(mainActivity.vizBtn2MenuItem, num);
    }

    public static final void R1(MainActivity mainActivity, Integer num) {
        G10.g(mainActivity, "this$0");
        Companion companion = INSTANCE;
        companion.g(mainActivity.vizBtn0MenuItem, num);
        companion.g(mainActivity.vizBtn1MenuItem, num);
        companion.g(mainActivity.vizBtn2MenuItem, num);
    }

    public static final void S1(MainActivity mainActivity) {
        G10.g(mainActivity, "this$0");
        MenuItem menuItem = mainActivity.vizBtn0MenuItem;
        if (menuItem != null) {
            G10.d(menuItem);
            menuItem.setVisible(false);
        }
        MenuItem menuItem2 = mainActivity.vizBtn1MenuItem;
        if (menuItem2 != null) {
            G10.d(menuItem2);
            menuItem2.setVisible(false);
        }
        MenuItem menuItem3 = mainActivity.vizBtn2MenuItem;
        if (menuItem3 != null) {
            G10.d(menuItem3);
            menuItem3.setVisible(false);
        }
    }

    public static final FP b1() {
        return INSTANCE.b();
    }

    public static final GP c1() {
        return INSTANCE.c();
    }

    public static final HP d1() {
        return INSTANCE.d();
    }

    public static final MainActivity e1() {
        return INSTANCE.e();
    }

    public static final boolean m1(MainActivity mainActivity, MenuItem menuItem) {
        G10.g(mainActivity, "$this_run");
        G10.g(menuItem, "menuItem");
        if (!mainActivity.s1(menuItem)) {
            return false;
        }
        DrawerLayout drawerLayout = mainActivity.drawerLayout;
        if (drawerLayout == null) {
            return true;
        }
        drawerLayout.f();
        return true;
    }

    public static final void n1(MainActivity mainActivity, CompoundButton compoundButton, boolean z) {
        G10.g(mainActivity, "$this_run");
        if (mainActivity.updatingSleepTimerSwitch) {
            return;
        }
        if (z) {
            T0.a(1);
        } else {
            T0.a(10);
        }
    }

    public static final void o1(MainActivity mainActivity, CompoundButton compoundButton, boolean z) {
        G10.g(mainActivity, "$this_run");
        if (mainActivity.updatingLockOrientSwitch) {
            return;
        }
        T0.a(2);
    }

    public static final void p1(MainActivity mainActivity, boolean z) {
        G10.g(mainActivity, "this$0");
        if (z) {
            Object objA = k1.a(Boolean.TRUE);
            G10.f(objA, "invoke(...)");
            mainActivity.D1(((Boolean) objA).booleanValue(), mainActivity.currentFragmentPage, true);
        }
    }

    public static final boolean q1() {
        Y0.a(Boolean.FALSE);
        return false;
    }

    public static final void r1(View view, boolean z) {
    }

    public final void A1(boolean z) {
        this.showDonationDialog.setValue(Boolean.valueOf(z));
    }

    public final void B1(boolean z) {
        this.showMoreTemplatesDialog.setValue(Boolean.valueOf(z));
    }

    public final void C1(boolean show, int pagePosition) {
        D1(show, pagePosition, false);
    }

    public final void D1(boolean show, int pagePosition, boolean eventFromSystemUiHider) {
        L01 l01;
        L01 l012;
        v1(show);
        AbstractC6687n2 abstractC6687n2M0 = m0();
        P1(pagePosition == 2);
        if (show) {
            if (abstractC6687n2M0 != null) {
                if (pagePosition == 2) {
                    abstractC6687n2M0.u(false);
                    abstractC6687n2M0.t(false);
                } else {
                    abstractC6687n2M0.u(true);
                    abstractC6687n2M0.t(true);
                }
                AbstractC1765Ob1.v(l1());
            }
            Object objA = i1.a(C2078Qw0.h);
            G10.f(objA, "invoke(...)");
            H1((C2078Qw0.b) objA);
            if (!eventFromSystemUiHider && (l012 = this.systemUiHider) != null) {
                G10.d(l012);
                l012.d();
            }
        } else {
            if (abstractC6687n2M0 != null) {
                AbstractC1765Ob1.r(l1());
            }
            if (!eventFromSystemUiHider && (l01 = this.systemUiHider) != null) {
                G10.d(l01);
                l01.a();
            }
        }
        c1.a(Boolean.valueOf(!show));
    }

    public final void E1() {
        try {
            androidx.fragment.app.FragmentManager fragmentManagerF0 = f0();
            G10.f(fragmentManagerF0, "getSupportFragmentManager(...)");
            fragmentManagerF0.f0();
            if (fragmentManagerF0.j0("promo") != null) {
                return;
            }
            new C3083aA0().X1(fragmentManagerF0, "promo");
            C4268eS.a aVar = C4268eS.i;
            aVar.c(aVar.b() + 1);
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public final void F1() {
        Intent intent = new Intent(this, (Class<?>) ComposableActivity.class);
        intent.putExtra("screen_name", "sub_dialog");
        startActivity(intent);
    }

    public final void G1(int pagePosition) {
        AbstractC6687n2 abstractC6687n2M0 = m0();
        C1((abstractC6687n2M0 == null || abstractC6687n2M0.l()) ? false : true, pagePosition);
    }

    public final void H1(C2078Qw0.b songData) {
        G10.g(songData, "songData");
        if (G10.c(songData, this.assignedSongData)) {
            return;
        }
        this.assignedSongData = songData;
        AbstractC6687n2 abstractC6687n2M0 = m0();
        if (abstractC6687n2M0 != null) {
            abstractC6687n2M0.x(songData.e);
            if (songData.i()) {
                abstractC6687n2M0.w(songData.h);
            } else {
                abstractC6687n2M0.w("");
            }
        }
        U0.a(new G3(songData.a, songData.d(), songData.b()), new k(), Integer.valueOf(RCHTTPStatusCodes.SUCCESS), Integer.valueOf(RCHTTPStatusCodes.SUCCESS));
    }

    public final void I1(boolean state, boolean evenFromOnCreateOptionsMenu) {
        SwitchCompat switchCompat = this.switchLockOrient;
        if (switchCompat != null) {
            this.updatingLockOrientSwitch = true;
            try {
                G10.d(switchCompat);
                switchCompat.setChecked(state);
            } finally {
                this.updatingLockOrientSwitch = false;
            }
        }
    }

    public final void J1() {
        MenuItem menuItem = (MenuItem) this.premiumMenuWeak.get();
        if (menuItem == null) {
            return;
        }
        G10.d(menuItem);
        C0746Eg1 c0746Eg1 = j1;
        Boolean bool = Boolean.FALSE;
        B61 b61 = (B61) c0746Eg1.a(new B61(bool, bool));
        Object obj = b61.b;
        G10.f(obj, "obj2");
        if (!((Boolean) obj).booleanValue()) {
            menuItem.setVisible(false);
            return;
        }
        Object obj2 = b61.a;
        G10.f(obj2, "obj1");
        if (((Boolean) obj2).booleanValue()) {
            menuItem.setIcon(AbstractC3374bD0.E);
        } else {
            menuItem.setIcon(AbstractC3374bD0.w);
        }
        menuItem.setVisible(true);
    }

    public final void K1() {
        L1((InterfaceC9894yX) a1.a(null));
    }

    public final void L1(InterfaceC9894yX currentSearchEntry) {
        MenuItem menuItem = this.searchMenuItem;
        if (menuItem == null) {
            return;
        }
        G10.d(menuItem);
        SearchView searchView = (SearchView) menuItem.getActionView();
        if (searchView == null) {
            return;
        }
        if (currentSearchEntry == null || !currentSearchEntry.isEnabled()) {
            MenuItem menuItem2 = this.searchMenuItem;
            G10.d(menuItem2);
            menuItem2.setVisible(false);
            searchView.setQueryHint("");
            return;
        }
        String strB = currentSearchEntry.b();
        MenuItem menuItem3 = this.searchMenuItem;
        G10.d(menuItem3);
        menuItem3.setVisible(true);
        if (strB == null || strB.length() == 0) {
            searchView.setTag(Integer.valueOf(currentSearchEntry.getIndex()));
            searchView.setQuery("", false);
        } else {
            searchView.setTag(Integer.valueOf(currentSearchEntry.getIndex()));
            searchView.setQuery(strB, false);
            if (searchView.isIconified()) {
                searchView.setIconified(false);
            }
        }
        searchView.setQueryHint(currentSearchEntry.a());
    }

    public final void M1(boolean state, boolean evenFromOnCreateOptionsMenu) {
        SwitchCompat switchCompat = this.switchSleepTimer;
        if (switchCompat != null) {
            this.updatingSleepTimerSwitch = true;
            try {
                G10.d(switchCompat);
                switchCompat.setChecked(state);
            } finally {
                this.updatingSleepTimerSwitch = false;
            }
        }
    }

    public final void N1(final boolean state, final boolean evenFromOnCreateOptionsMenu) {
        Handler handler = this.handler;
        if (handler == null) {
            G10.u("handler");
            handler = null;
        }
        handler.post(new Runnable() { // from class: com.daaw.Pf0
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.O1(this.B, state, evenFromOnCreateOptionsMenu);
            }
        });
    }

    public final void P1(boolean show) {
        if (!show) {
            MenuItem menuItem = this.vizBtn0MenuItem;
            if (menuItem != null) {
                G10.d(menuItem);
                if (menuItem.isVisible()) {
                    int integer = getResources().getInteger(android.R.integer.config_shortAnimTime);
                    ValueAnimator valueAnimator = this.vizMenuButtonAnimator;
                    InterfaceC5559j2 interfaceC5559j2 = new InterfaceC5559j2() { // from class: com.daaw.Qf0
                        @Override // com.daaw.InterfaceC5559j2
                        public final void a(Object obj) {
                            MainActivity.R1(this.a, (Integer) obj);
                        }
                    };
                    MenuItem menuItem2 = this.vizBtn0MenuItem;
                    G10.d(menuItem2);
                    Drawable icon = menuItem2.getIcon();
                    G10.d(icon);
                    this.vizMenuButtonAnimator = AbstractC1765Ob1.e(valueAnimator, interfaceC5559j2, icon.getAlpha(), integer, new InterfaceC6408m2() { // from class: com.daaw.Rf0
                        @Override // com.daaw.InterfaceC6408m2
                        public final void a() {
                            MainActivity.S1(this.a);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        MenuItem menuItem3 = this.vizBtn0MenuItem;
        if (menuItem3 != null) {
            G10.d(menuItem3);
            if (menuItem3.isVisible()) {
                return;
            }
            int integer2 = getResources().getInteger(android.R.integer.config_shortAnimTime);
            MenuItem menuItem4 = this.vizBtn0MenuItem;
            G10.d(menuItem4);
            menuItem4.setVisible(true);
            MenuItem menuItem5 = this.vizBtn1MenuItem;
            G10.d(menuItem5);
            menuItem5.setVisible(true);
            MenuItem menuItem6 = this.vizBtn2MenuItem;
            G10.d(menuItem6);
            menuItem6.setVisible(true);
            ValueAnimator valueAnimator2 = this.vizMenuButtonAnimator;
            InterfaceC5559j2 interfaceC5559j22 = new InterfaceC5559j2() { // from class: com.daaw.Mf0
                @Override // com.daaw.InterfaceC5559j2
                public final void a(Object obj) {
                    MainActivity.Q1(this.a, (Integer) obj);
                }
            };
            MenuItem menuItem7 = this.vizBtn0MenuItem;
            G10.d(menuItem7);
            Drawable icon2 = menuItem7.getIcon();
            G10.d(icon2);
            this.vizMenuButtonAnimator = AbstractC1765Ob1.f(valueAnimator2, interfaceC5559j22, icon2.getAlpha(), integer2);
        }
    }

    public final boolean X0() {
        MenuItem menuItem = this.searchMenuItem;
        if (menuItem == null) {
            return false;
        }
        G10.d(menuItem);
        SearchView searchView = (SearchView) menuItem.getActionView();
        if (searchView == null || searchView.isIconified()) {
            return false;
        }
        searchView.setTag(Integer.valueOf(this.currentFragmentPage));
        searchView.setQuery("", false);
        searchView.setIconified(true);
        return true;
    }

    public final void Y0() {
        Q0.a();
        finish();
    }

    public final void Z0() {
        finish();
    }

    public final Fragment a1(int position) {
        b bVar = null;
        if (this.viewPager == null) {
            return null;
        }
        if (this.sectionsPagerAdapter == null) {
            G10.u("sectionsPagerAdapter");
        }
        b bVar2 = this.sectionsPagerAdapter;
        if (bVar2 == null) {
            G10.u("sectionsPagerAdapter");
        } else {
            bVar = bVar2;
        }
        CustomViewPager customViewPager = this.viewPager;
        FragmentManager fragmentManager = getFragmentManager();
        G10.d(customViewPager);
        return fragmentManager.findFragmentByTag("android:switcher:" + customViewPager.getId() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + bVar.q(position));
    }

    public final WB0 f1() {
        return (WB0) this.purchaseService.getValue();
    }

    public final MR0 g1() {
        return (MR0) this.sharedPrefs.getValue();
    }

    public final boolean h1() {
        return ((Boolean) this.show30DiscountDialog.getValue()).booleanValue();
    }

    public final boolean i1() {
        return ((Boolean) this.show70DiscountDialog.getValue()).booleanValue();
    }

    public final boolean j1() {
        return ((Boolean) this.showDonationDialog.getValue()).booleanValue();
    }

    public final boolean k1() {
        return ((Boolean) this.showMoreTemplatesDialog.getValue()).booleanValue();
    }

    public final Toolbar l1() {
        Toolbar toolbar = this.toolBar;
        if (toolbar != null) {
            return toolbar;
        }
        G10.u("toolBar");
        return null;
    }

    @Override // com.daaw.MP, com.daaw.AbstractActivityC5776jo, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (((Boolean) g1.a(Integer.valueOf(requestCode), Integer.valueOf(resultCode), data, Boolean.FALSE)).booleanValue() || resultCode != -1) {
            return;
        }
        h1.a(Integer.valueOf(resultCode), data);
    }

    @Override // com.daaw.P8, com.daaw.AbstractActivityC5776jo, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        G10.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        O0.a(newConfig);
    }

    @Override // com.daaw.MP, com.daaw.AbstractActivityC5776jo, com.daaw.AbstractActivityC7459po, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IL.a().c("MainActivity onCreate");
        o1 = this;
        if (AbstractC0405Bb1.a) {
            try {
                Security.insertProviderAt(Conscrypt.newProvider(), 1);
                HttpsURLConnection.setDefaultSSLSocketFactory(new R01());
            } catch (Exception e2) {
                AbstractC0441Bk1.b(e2, "Failed adding TLSv1.3 - IceCast probably broken");
            }
        }
        this.playerCore = a.d.e();
        try {
            PreferenceManager.setDefaultValues(getApplicationContext(), AbstractC5339iE0.a, false);
            ListPreferenceLanguage.a(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.P(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()), "pref_appLang", "en"));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        S0.a(getApplicationContext());
        setTheme(C7110oa.a(this));
        setContentView(AbstractC9815yD0.r0);
        J0.a(this);
        View viewFindViewById = findViewById(AbstractC5056hD0.y3);
        G10.e(viewFindViewById, "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        this.toolBar = (Toolbar) viewFindViewById;
        w0(l1());
        AbstractC1765Ob1.t(findViewById(AbstractC5056hD0.u4));
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(AbstractC5056hD0.F0);
        this.drawerLayout = drawerLayout;
        Handler handler = null;
        if (drawerLayout != null) {
            drawerLayout.a((DrawerLayout.e) X61.h.f().a(null));
        }
        NavigationView navigationView = (NavigationView) findViewById(AbstractC5056hD0.m2);
        navigationView.setBackgroundColor(AbstractC1765Ob1.o(getTheme(), this, IC0.a, PC0.f));
        ((TextView) navigationView.g(0).findViewById(AbstractC5056hD0.l2)).setText(AbstractC0405Bb1.m());
        navigationView.setNavigationItemSelectedListener(new NavigationView.c() { // from class: com.daaw.Uf0
            @Override // com.google.android.material.navigation.NavigationView.c
            public final boolean a(MenuItem menuItem) {
                return MainActivity.m1(this.a, menuItem);
            }
        });
        MenuItem menuItemFindItem = navigationView.getMenu().findItem(AbstractC5056hD0.e2);
        menuItemFindItem.setTitle(Html.fromHtml("<b>" + ((Object) menuItemFindItem.getTitle()) + "</b>"));
        this.premiumMenuWeak = new WeakReference(menuItemFindItem);
        View actionView = navigationView.getMenu().findItem(AbstractC5056hD0.h2).getActionView();
        G10.d(actionView);
        this.switchSleepTimer = (SwitchCompat) actionView.findViewById(AbstractC5056hD0.G0);
        View actionView2 = navigationView.getMenu().findItem(AbstractC5056hD0.d2).getActionView();
        G10.d(actionView2);
        this.switchLockOrient = (SwitchCompat) actionView2.findViewById(AbstractC5056hD0.G0);
        SwitchCompat switchCompat = this.switchSleepTimer;
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.daaw.Vf0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    MainActivity.n1(this.a, compoundButton, z);
                }
            });
        }
        SwitchCompat switchCompat2 = this.switchLockOrient;
        if (switchCompat2 != null) {
            switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.daaw.Wf0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    MainActivity.o1(this.a, compoundButton, z);
                }
            });
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e();
        sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.d0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.J, sharedPreferencesOnSharedPreferenceChangeListenerC5706jaE.k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.J), true);
        this.sectionsPagerAdapter = new b(getFragmentManager());
        View viewFindViewById2 = findViewById(AbstractC5056hD0.t4);
        G10.e(viewFindViewById2, "null cannot be cast to non-null type com.daaw.avee.CustomViewPager");
        CustomViewPager customViewPager = (CustomViewPager) viewFindViewById2;
        this.viewPager = customViewPager;
        G10.d(customViewPager);
        b bVar = this.sectionsPagerAdapter;
        if (bVar == null) {
            G10.u("sectionsPagerAdapter");
            bVar = null;
        }
        customViewPager.setAdapter(bVar);
        CustomViewPager customViewPager2 = this.viewPager;
        G10.d(customViewPager2);
        customViewPager2.setOnSwipeOutListener(new c());
        L01 q01 = Build.VERSION.SDK_INT > 30 ? new Q01(this.viewPager, 2, getWindow()) : new M01(this.viewPager, 2);
        this.systemUiHider = q01;
        G10.d(q01);
        q01.c();
        L01 l01 = this.systemUiHider;
        G10.d(l01);
        l01.d();
        L01 l012 = this.systemUiHider;
        G10.d(l012);
        l012.b(new L01.b() { // from class: com.daaw.Xf0
            @Override // com.daaw.L01.b
            public final void a(boolean z) {
                MainActivity.p1(this.a, z);
            }
        });
        Object objA = m1.a(getIntent(), Boolean.FALSE);
        G10.f(objA, "invoke(...)");
        if (((Boolean) objA).booleanValue()) {
            CustomViewPager customViewPager3 = this.viewPager;
            G10.d(customViewPager3);
            customViewPager3.setCurrentItem(2);
            t1(2);
        } else {
            int iK = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.G);
            CustomViewPager customViewPager4 = this.viewPager;
            G10.d(customViewPager4);
            customViewPager4.setCurrentItem(iK);
            t1(iK);
        }
        CustomViewPager customViewPager5 = this.viewPager;
        G10.d(customViewPager5);
        customViewPager5.b(new d());
        Handler handler2 = this.handler;
        if (handler2 == null) {
            G10.u("handler");
            handler2 = null;
        }
        Message messageObtainMessage = handler2.obtainMessage(3);
        G10.f(messageObtainMessage, "obtainMessage(...)");
        Handler handler3 = this.handler;
        if (handler3 == null) {
            G10.u("handler");
            handler3 = null;
        }
        handler3.removeMessages(3);
        Handler handler4 = this.handler;
        if (handler4 == null) {
            G10.u("handler");
            handler4 = null;
        }
        handler4.sendMessageDelayed(messageObtainMessage, 10000L);
        Handler handler5 = this.handler;
        if (handler5 == null) {
            G10.u("handler");
            handler5 = null;
        }
        Message messageObtainMessage2 = handler5.obtainMessage(4);
        G10.f(messageObtainMessage2, "obtainMessage(...)");
        Handler handler6 = this.handler;
        if (handler6 == null) {
            G10.u("handler");
            handler6 = null;
        }
        handler6.removeMessages(4);
        Handler handler7 = this.handler;
        if (handler7 == null) {
            G10.u("handler");
        } else {
            handler = handler7;
        }
        handler.sendMessageDelayed(messageObtainMessage2, 1000L);
        C7050oL.q(this);
        AbstractC7329pL abstractC7329pLC = AbstractC7329pL.c();
        G10.f(abstractC7329pLC, "getInstance(...)");
        abstractC7329pLC.e(C9453wv0.b());
        ((ComposeView) findViewById(AbstractC5056hD0.A0)).setContent(AbstractC1815Oo.c(535897238, true, new e()));
        ((ComposeView) findViewById(AbstractC5056hD0.E0)).setContent(C2359To.a.a());
        c().h(this, new f());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        G10.g(menu, "menu");
        getMenuInflater().inflate(ED0.b, menu);
        IT0 it0 = (IT0) V0.a(null);
        if (it0 == null) {
            it0 = new IT0();
        }
        M1(it0.a, true);
        Boolean bool = (Boolean) W0.a(Boolean.FALSE);
        G10.d(bool);
        I1(bool.booleanValue(), true);
        MenuItem menuItemFindItem = menu.findItem(AbstractC5056hD0.a);
        this.searchMenuItem = menuItemFindItem;
        SearchView searchView = (SearchView) (menuItemFindItem != null ? menuItemFindItem.getActionView() : null);
        if (searchView != null) {
            searchView.setIconifiedByDefault(true);
            searchView.setSubmitButtonEnabled(false);
            searchView.setOnQueryTextListener(new g(searchView));
            searchView.setOnCloseListener(new SearchView.OnCloseListener() { // from class: com.daaw.Yf0
                @Override // android.widget.SearchView.OnCloseListener
                public final boolean onClose() {
                    return MainActivity.q1();
                }
            });
            searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.daaw.Nf0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    MainActivity.r1(view, z);
                }
            });
            x1(searchView);
            K1();
        }
        J1();
        this.vizBtn0MenuItem = menu.findItem(AbstractC5056hD0.b);
        this.vizBtn1MenuItem = menu.findItem(AbstractC5056hD0.c);
        this.vizBtn2MenuItem = menu.findItem(AbstractC5056hD0.d);
        P1(this.currentFragmentPage == 2);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.daaw.P8, com.daaw.MP, android.app.Activity
    public void onDestroy() {
        AbstractC0441Bk1.a("######### onDestroy");
        this.playerCore = null;
        this.viewPager = null;
        this.slowClosingToast = null;
        this.slowClosingTimer = null;
        this.systemUiHider = null;
        this.drawerLayout = null;
        this.switchSleepTimer = null;
        this.switchLockOrient = null;
        this.searchMenuItem = null;
        this.vizBtn0MenuItem = null;
        this.vizBtn1MenuItem = null;
        this.vizBtn2MenuItem = null;
        this.assignedSongData = null;
        P0.a();
        w1(false, false);
        super.onDestroy();
    }

    @Override // com.daaw.P8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        G10.g(event, "event");
        if (keyCode == 4 && X0()) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        G10.g(event, "event");
        int integer = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(getApplicationContext(), "pref_hold_exit", true) ? getResources().getInteger(AbstractC9536xD0.a) : 0;
        if (keyCode != 4 || integer <= 0) {
            return super.onKeyLongPress(keyCode, event);
        }
        this.slowClosingInProgress = true;
        Context applicationContext = getApplicationContext();
        String string = getString(JD0.c2);
        G10.f(string, "getString(...)");
        Toast toastMakeText = Toast.makeText(applicationContext, string, 0);
        this.slowClosingToast = toastMakeText;
        if (toastMakeText != null) {
            toastMakeText.show();
        }
        Timer timer = new Timer();
        this.slowClosingTimer = timer;
        G10.d(timer);
        timer.schedule(new h(), integer);
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        G10.g(event, "event");
        if (keyCode != 4 || !this.slowClosingInProgress) {
            return super.onKeyUp(keyCode, event);
        }
        this.slowClosingInProgress = false;
        Timer timer = this.slowClosingTimer;
        if (timer != null) {
            G10.d(timer);
            timer.cancel();
        }
        this.slowClosingTimer = null;
        Toast toast = this.slowClosingToast;
        G10.d(toast);
        toast.setText(getString(JD0.d2));
        Toast toast2 = this.slowClosingToast;
        G10.d(toast2);
        toast2.setDuration(0);
        Toast toast3 = this.slowClosingToast;
        G10.d(toast3);
        toast3.show();
        return true;
    }

    @Override // com.daaw.AbstractActivityC5776jo, android.app.Activity
    public void onNewIntent(Intent intent) {
        G10.g(intent, "intent");
        Object objA = m1.a(intent, Boolean.FALSE);
        G10.f(objA, "invoke(...)");
        if (((Boolean) objA).booleanValue()) {
            CustomViewPager customViewPager = this.viewPager;
            G10.d(customViewPager);
            customViewPager.setCurrentItem(2);
            t1(2);
        }
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        G10.g(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            u1();
            return true;
        }
        if (itemId == AbstractC5056hD0.b) {
            C0850Fg1 c0850Fg1 = n1;
            Boolean bool = Boolean.FALSE;
            Object objA = c0850Fg1.a(1, bool);
            G10.f(objA, "invoke(...)");
            if (((Boolean) objA).booleanValue()) {
                return true;
            }
            Object objA2 = n1.a(2, bool);
            G10.f(objA2, "invoke(...)");
            if (((Boolean) objA2).booleanValue()) {
                return true;
            }
            Object objA3 = n1.a(3, bool);
            G10.f(objA3, "invoke(...)");
            if (((Boolean) objA3).booleanValue() || s1(item)) {
                return true;
            }
        } else if (itemId == AbstractC5056hD0.c) {
            C0850Fg1 c0850Fg12 = n1;
            Boolean bool2 = Boolean.FALSE;
            Object objA4 = c0850Fg12.a(2, bool2);
            G10.f(objA4, "invoke(...)");
            if (((Boolean) objA4).booleanValue()) {
                return true;
            }
            Object objA5 = n1.a(3, bool2);
            G10.f(objA5, "invoke(...)");
            if (((Boolean) objA5).booleanValue() || s1(item)) {
                return true;
            }
        } else if (itemId == AbstractC5056hD0.d) {
            Object objA6 = n1.a(3, Boolean.FALSE);
            G10.f(objA6, "invoke(...)");
            if (((Boolean) objA6).booleanValue() || s1(item)) {
                return true;
            }
        } else if (s1(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.daaw.MP, android.app.Activity
    public void onPause() {
        AbstractC0441Bk1.a("######### onPause");
        M0.a(this);
        super.onPause();
    }

    @Override // com.daaw.MP, com.daaw.AbstractActivityC5776jo, android.app.Activity, com.daaw.AbstractC9204w2.c
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        G10.g(permissions, "permissions");
        G10.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        g1().d().b(Boolean.TRUE);
        f1.a(this, Integer.valueOf(requestCode));
    }

    @Override // com.daaw.MP, android.app.Activity
    public void onResume() {
        super.onResume();
        L0.a(this);
        if (((Boolean) g1().d().a()).booleanValue()) {
            f1().P();
        }
    }

    @Override // com.daaw.P8, com.daaw.MP, android.app.Activity
    public void onStart() {
        K0.a(this);
        super.onStart();
        Handler handler = this.handler;
        Handler handler2 = null;
        if (handler == null) {
            G10.u("handler");
            handler = null;
        }
        Message messageObtainMessage = handler.obtainMessage(3);
        G10.f(messageObtainMessage, "obtainMessage(...)");
        Handler handler3 = this.handler;
        if (handler3 == null) {
            G10.u("handler");
            handler3 = null;
        }
        handler3.removeMessages(3);
        Handler handler4 = this.handler;
        if (handler4 == null) {
            G10.u("handler");
        } else {
            handler2 = handler4;
        }
        handler2.sendMessageDelayed(messageObtainMessage, 10000L);
        if (((Boolean) g1().d().a()).booleanValue()) {
            f1().P();
        }
    }

    @Override // com.daaw.P8, com.daaw.MP, android.app.Activity
    public void onStop() {
        AbstractC0441Bk1.a("######### onStop");
        super.onStop();
        N0.a(this);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        v1(true);
        super.onUserInteraction();
    }

    public final boolean s1(MenuItem item) {
        G10.g(item, "item");
        int itemId = item.getItemId();
        if (itemId == AbstractC5056hD0.g2) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
            return true;
        }
        if (itemId == AbstractC5056hD0.i2) {
            E1();
            return true;
        }
        if (itemId == AbstractC5056hD0.h2) {
            SwitchCompat switchCompat = this.switchSleepTimer;
            G10.d(switchCompat);
            switchCompat.toggle();
            return false;
        }
        if (itemId == AbstractC5056hD0.b2) {
            T0.a(3);
            return true;
        }
        if (itemId == AbstractC5056hD0.d2) {
            SwitchCompat switchCompat2 = this.switchLockOrient;
            G10.d(switchCompat2);
            switchCompat2.toggle();
            return false;
        }
        if (itemId == AbstractC5056hD0.c2) {
            CustomViewPager customViewPager = this.viewPager;
            G10.d(customViewPager);
            customViewPager.setCurrentItem(0);
            return true;
        }
        if (itemId == AbstractC5056hD0.f2) {
            CustomViewPager customViewPager2 = this.viewPager;
            G10.d(customViewPager2);
            customViewPager2.setCurrentItem(1);
            return true;
        }
        if (itemId == AbstractC5056hD0.j2) {
            CustomViewPager customViewPager3 = this.viewPager;
            G10.d(customViewPager3);
            customViewPager3.setCurrentItem(2);
            return true;
        }
        if (itemId == AbstractC5056hD0.k2) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.aveeplayer.com/")));
            return true;
        }
        if (itemId == AbstractC5056hD0.a2) {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "Avee Player <support@aveeplayer.com>", null));
            intent.putExtra("android.intent.extra.SUBJECT", "Contact from application");
            intent.putExtra("android.intent.extra.TEXT", "");
            startActivity(Intent.createChooser(intent, "Choose an Email client:"));
            return true;
        }
        if (itemId == AbstractC5056hD0.Z1) {
            A1(true);
            return true;
        }
        if (itemId != AbstractC5056hD0.e2) {
            return false;
        }
        T0.a(4);
        return true;
    }

    public final void t1(int position) {
        this.currentFragmentPage = position;
        Object objA = k1.a(Boolean.TRUE);
        G10.f(objA, "invoke(...)");
        C1(((Boolean) objA).booleanValue(), this.currentFragmentPage);
        R0.a(Integer.valueOf(this.currentFragmentPage), this);
        Z0.a(Integer.valueOf(this.currentFragmentPage));
    }

    public final void u1() {
        DrawerLayout drawerLayout = this.drawerLayout;
        if (drawerLayout == null) {
            return;
        }
        G10.d(drawerLayout);
        drawerLayout.H(8388611);
    }

    public final void v1(boolean resetTimer) {
        if (SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().h(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.n)) {
            Handler handler = this.handler;
            Handler handler2 = null;
            if (handler == null) {
                G10.u("handler");
                handler = null;
            }
            handler.removeMessages(2);
            if (resetTimer) {
                int integer = getResources().getInteger(AbstractC9536xD0.d);
                Handler handler3 = this.handler;
                if (handler3 == null) {
                    G10.u("handler");
                    handler3 = null;
                }
                Message messageObtainMessage = handler3.obtainMessage(2);
                G10.f(messageObtainMessage, "obtainMessage(...)");
                Handler handler4 = this.handler;
                if (handler4 == null) {
                    G10.u("handler");
                } else {
                    handler2 = handler4;
                }
                handler2.sendMessageDelayed(messageObtainMessage, integer);
            }
        }
    }

    public final void w1(boolean b2, boolean dim) {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = dim ? 1.0f : 0.0f;
        window.setAttributes(attributes);
        if (b2) {
            window.addFlags(128);
        } else {
            window.clearFlags(128);
        }
    }

    public final void x1(SearchView searchView) {
        AbstractC1765Ob1.u(searchView, AbstractC9438ws.c(this, PC0.f), AbstractC9438ws.c(this, PC0.e));
    }

    public final void y1(boolean z) {
        this.show30DiscountDialog.setValue(Boolean.valueOf(z));
    }

    public final void z1(boolean z) {
        this.show70DiscountDialog.setValue(Boolean.valueOf(z));
    }
}

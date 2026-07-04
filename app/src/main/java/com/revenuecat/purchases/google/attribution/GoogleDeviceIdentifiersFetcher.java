package com.revenuecat.purchases.google.attribution;

import android.app.Application;
import android.provider.Settings;
import com.daaw.AbstractC1473Lg0;
import com.daaw.BT;
import com.daaw.CT;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.NQ;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ7\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "<init>", "(Lcom/revenuecat/purchases/common/Dispatcher;)V", "Landroid/app/Application;", "applicationContext", "", "kotlin.jvm.PlatformType", "getAndroidID", "(Landroid/app/Application;)Ljava/lang/String;", "getAdvertisingID", "Lkotlin/Function1;", "", "Lcom/daaw/G91;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;Lcom/daaw/NQ;)V", "Lcom/revenuecat/purchases/common/Dispatcher;", "noPermissionAdvertisingIdValue", "Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GoogleDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    private final Dispatcher dispatcher;
    private final String noPermissionAdvertisingIdValue;

    public GoogleDeviceIdentifiersFetcher(Dispatcher dispatcher) {
        G10.g(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        this.noPermissionAdvertisingIdValue = "00000000-0000-0000-0000-000000000000";
    }

    private final String getAdvertisingID(Application applicationContext) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(applicationContext);
            if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                return null;
            }
            if (!G10.c(advertisingIdInfo.getId(), this.noPermissionAdvertisingIdValue)) {
                return advertisingIdInfo.getId();
            }
            LogWrapperKt.log(LogIntent.WARNING, AttributionStrings.GOOGLE_PLAY_ADVERTISING_ID_NOT_AVAILABLE);
            return null;
        } catch (BT e) {
            LogIntent logIntent = LogIntent.GOOGLE_ERROR;
            String str = String.format(AttributionStrings.GOOGLE_PLAY_SERVICES_NOT_INSTALLED_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e.getLocalizedMessage()}, 1));
            G10.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            return null;
        } catch (CT e2) {
            LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
            String str2 = String.format(AttributionStrings.GOOGLE_PLAY_SERVICES_REPAIRABLE_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e2.getLocalizedMessage()}, 1));
            G10.f(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent2, str2);
            return null;
        } catch (IOException e3) {
            LogIntent logIntent3 = LogIntent.GOOGLE_ERROR;
            String str3 = String.format(AttributionStrings.IO_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e3.getLocalizedMessage()}, 1));
            G10.f(str3, "format(this, *args)");
            LogWrapperKt.log(logIntent3, str3);
            return null;
        } catch (TimeoutException e4) {
            LogIntent logIntent4 = LogIntent.GOOGLE_ERROR;
            String str4 = String.format(AttributionStrings.TIMEOUT_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, Arrays.copyOf(new Object[]{e4.getLocalizedMessage()}, 1));
            G10.f(str4, "format(this, *args)");
            LogWrapperKt.log(logIntent4, str4);
            return null;
        }
    }

    private final String getAndroidID(Application applicationContext) {
        return Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDeviceIdentifiers$lambda$0(GoogleDeviceIdentifiersFetcher googleDeviceIdentifiersFetcher, Application application, NQ nq) {
        G10.g(googleDeviceIdentifiersFetcher, "this$0");
        G10.g(application, "$applicationContext");
        G10.g(nq, "$completion");
        nq.invoke(MapExtensionsKt.filterNotNullValues(AbstractC1473Lg0.k(D61.a(SubscriberAttributeKey.DeviceIdentifiers.GPSAdID.INSTANCE.getBackendKey(), googleDeviceIdentifiersFetcher.getAdvertisingID(application)), D61.a(SubscriberAttributeKey.DeviceIdentifiers.AndroidID.INSTANCE.getBackendKey(), googleDeviceIdentifiersFetcher.getAndroidID(application)), D61.a(SubscriberAttributeKey.DeviceIdentifiers.IP.INSTANCE.getBackendKey(), "true"))));
    }

    @Override // com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher
    public void getDeviceIdentifiers(final Application applicationContext, final NQ completion) {
        G10.g(applicationContext, "applicationContext");
        G10.g(completion, "completion");
        Dispatcher.enqueue$default(this.dispatcher, new Runnable() { // from class: com.daaw.AT
            @Override // java.lang.Runnable
            public final void run() {
                GoogleDeviceIdentifiersFetcher.getDeviceIdentifiers$lambda$0(this.B, applicationContext, completion);
            }
        }, null, 2, null);
    }
}

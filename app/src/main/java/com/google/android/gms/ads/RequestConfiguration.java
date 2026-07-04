package com.google.android.gms.ads;

import com.daaw.AbstractC4274eT1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RequestConfiguration {
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    public final int a;
    public final int b;
    public final String c;
    public final List d;
    public final PublisherPrivacyPersonalizationState e;
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, MAX_AD_CONTENT_RATING_T, MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    public static class Builder {
        public int a = -1;
        public int b = -1;
        public String c = null;
        public final List d = new ArrayList();
        public PublisherPrivacyPersonalizationState e = PublisherPrivacyPersonalizationState.DEFAULT;

        public RequestConfiguration build() {
            return new RequestConfiguration(this.a, this.b, this.c, this.d, this.e, null);
        }

        public Builder setMaxAdContentRating(String str) {
            if (str == null || "".equals(str)) {
                this.c = null;
                return this;
            }
            if (RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_T.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                this.c = str;
                return this;
            }
            AbstractC4274eT1.zzj("Invalid value passed to setMaxAdContentRating: ".concat(str));
            return this;
        }

        public Builder setPublisherPrivacyPersonalizationState(PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
            this.e = publisherPrivacyPersonalizationState;
            return this;
        }

        public Builder setTagForChildDirectedTreatment(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.a = i;
                return this;
            }
            AbstractC4274eT1.zzj("Invalid value passed to setTagForChildDirectedTreatment: " + i);
            return this;
        }

        public Builder setTagForUnderAgeOfConsent(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.b = i;
                return this;
            }
            AbstractC4274eT1.zzj("Invalid value passed to setTagForUnderAgeOfConsent: " + i);
            return this;
        }

        public Builder setTestDeviceIds(List<String> list) {
            this.d.clear();
            if (list != null) {
                this.d.addAll(list);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);

        public final int B;

        PublisherPrivacyPersonalizationState(int i) {
            this.B = i;
        }

        public int getValue() {
            return this.B;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForUnderAgeOfConsent {
    }

    public /* synthetic */ RequestConfiguration(int i, int i2, String str, List list, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState, zzh zzhVar) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = list;
        this.e = publisherPrivacyPersonalizationState;
    }

    public String getMaxAdContentRating() {
        String str = this.c;
        return str == null ? "" : str;
    }

    public PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.e;
    }

    public int getTagForChildDirectedTreatment() {
        return this.a;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.b;
    }

    public List<String> getTestDeviceIds() {
        return new ArrayList(this.d);
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setTagForChildDirectedTreatment(this.a);
        builder.setTagForUnderAgeOfConsent(this.b);
        builder.setMaxAdContentRating(this.c);
        builder.setTestDeviceIds(this.d);
        return builder;
    }
}

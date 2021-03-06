package com.bitTiger.searchAds.adsInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Inventory {
    private final AdsInventory _adsInventory;
    private final CampaignInventory _campaignInventory;

    public Inventory(AdsInventory _adsInventory,
            CampaignInventory _campaignInventory) {
        this._adsInventory = _adsInventory;
        this._campaignInventory = _campaignInventory;
    }

    public Map<Long, AdsInfo>  showAds() {
        return _adsInventory.GetAdsInfoInventory();
    }

    public Map<Long, CampaignInfo> showCamps() {
        return _campaignInventory.GetCampaignInventory();
    }

    public AdsInfo findAds(Long adsId) {
        return _adsInventory.findAds(adsId);
    }

    public CampaignInfo findCampaign(Long campaignId) {
        return _campaignInventory.findCampaign(campaignId);
    }

    public int size() {
        return _adsInventory.size();
    }

    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return _adsInventory.isEmpty();
    }
}
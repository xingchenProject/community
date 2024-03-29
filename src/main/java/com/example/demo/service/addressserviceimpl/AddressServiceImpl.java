package com.example.demo.service.addressserviceimpl;

import com.example.demo.dao.AddressInfoMapper;
import com.example.demo.entity.AddressInfo;
import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressInfoMapper addressInfoMapper;
    @Override
    public void registerAddress(AddressInfo addressInfo) {
        addressInfoMapper.insertAddressInfo(addressInfo);
    }

    @Override
    public List<AddressInfo> getAllAddress() {
        return addressInfoMapper.selectAllAddress();
    }
}

package com.kokwai.store.controller;

import com.kokwai.store.dto.response.StoreDto;
import com.kokwai.store.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.kokwai.store.constant.StoreConstant.GET_ALL_STORE_REQUEST;

@RestController
@RequestMapping("/api/v1")
public class StoreController {

    private static final Logger LOG = LoggerFactory.getLogger(StoreController.class);

    @GetMapping("/store")
    public ResponseEntity<List<StoreDto>> getStore() {
        LOG.info( GET_ALL_STORE_REQUEST );
        try {
            StoreDto storeDto = StoreDto.builder()
                    .title("First store item")
                    .build();
            return ResponseUtil.generateSuccessResponse( List.of( storeDto ), HttpStatus.OK, GET_ALL_STORE_REQUEST );
        } catch( Exception exception ) {
            return ResponseUtil.generateErrorResponse( HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage() );
        }
    }

}

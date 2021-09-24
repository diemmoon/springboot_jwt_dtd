package com.example.springboot_jwt_dtd.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class JwtUtil {
    private static Logger logger= LoggerFactory.getLogger(JwtUtil.class);
    private  static  final String USER="diem";
    private static final String SECRET="fglyfgjekjgjon";

//    public String generateToken(UserPrincipal user) {
//        String token = null;
//        try {
//            JWTClaimsSet.Builder builder = new JWTClaimsSet.Builder();
//
//            builder.claim(USER, user);
//            builder.expirationTime(generateExpirationDate());
//            JWTClaimsSet claimsSet = builder.build();
//
//            SignedJWT signedJWT = new SignedJWT(new JWSHeader(JWSAlgorithm.HS256), claimsSet);
//            JWSSigner signer = new MACSigner(SECRET.getBytes());
//            signedJWT.sign(signer);
//
//            token = signedJWT.serialize();
//        } catch (Exception e) {
//            logger.error(e.getMessage());
//        }
//        return token;
//    }

}

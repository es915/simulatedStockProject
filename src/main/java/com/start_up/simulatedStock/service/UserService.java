package com.start_up.simulatedStock.service;

import com.start_up.simulatedStock.domain.User;
import com.start_up.simulatedStock.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //    public MemberService(MemberRepository memberRepository){
//        this.memberRepository = memberRepository;
//    }
    public Long join(User user){
        // 같은 이름이 있는 중복 회원 X
        validateDuplicateMember(user);

        userRepository.save(user);
        return user.getId();
    }

    private void validateDuplicateMember(User user) {
        userRepository.findByName(user.getNickname())
                .ifPresent(m ->{
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    // 전체 회원 조회
    public List<User> findUsers(){
        return userRepository.findAll();
    }

    public Optional<User> findOne(Long userId){
        return userRepository.findById(userId);
    }
}

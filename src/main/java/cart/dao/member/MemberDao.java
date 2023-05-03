package cart.dao.member;

import cart.dao.Dao;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MemberDao implements Dao<MemberEntity> {

    final RowMapper<MemberEntity> rowMapper = (rs, rowNum) ->
            new MemberEntity(
                    rs.getLong("id"),
                    rs.getString("email"),
                    rs.getString("password")
            );
    private final JdbcTemplate jdbcTemplate;

    public MemberDao(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public MemberEntity findById(final Long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<MemberEntity> findAll() {
        final String sql = "SELECT * FROM member";

        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public Long save(final MemberEntity memberEntity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int update(final MemberEntity memberEntity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int deleteById(final Long id) {
        throw new UnsupportedOperationException();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rajeewa.blockchainvotingsystem.block;

/**
 *
 * @author Rajeewa Asmadala
 */
import java.io.Serializable;


public class Block implements Serializable
{
	//inner class
	public class Vote implements Serializable
	{
		private String voterId;
		private String voteParty;

		public Vote(String voterId, String voteParty)
		{
			this.voterId=voterId;
			this.voteParty=voteParty;
		}

		public String getVoterId() {
			return voterId;
		}

		public void setVoterId(String voterId) {
			this.voterId = voterId;
		}


		public String getVoteParty() {
			return voteParty;
		}

		public void setVoteParty(String voteParty) {
			this.voteParty = voteParty;
		}
	}

	private Vote voteObj;
	
	private int previousHash;
	private int blockHash;

	public Block(int previousHash, String voterId, String voteParty)
	{
		this.previousHash=previousHash;
		voteObj=new Vote(voterId, voteParty);

		Object[] contents={voteObj.hashCode(), previousHash};
		this.blockHash=contents.hashCode();
	}

	public Vote getVoteObj() {
		return voteObj;
	}

	public void setVoteObj(Vote voteObj) {
		this.voteObj = voteObj;
	}

	public int getPreviousHash() {
		return previousHash;
	}

	public void setPreviousHash(int previousHash) {
		this.previousHash = previousHash;
	}

	public int getBlockHash() {
		return blockHash;
	}

	public void setBlockHash(int blockHash) {
		this.blockHash = blockHash;
	}
	
}